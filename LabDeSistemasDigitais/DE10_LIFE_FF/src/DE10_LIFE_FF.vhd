entity DE10_LIFE_FF is
	port(
		sw: in bit_vector(9 downto 0);
		key: in bit_vector(1 downto 0);
		LEDR: out bit_vector(9 downto 0)
	);
end DE10_LIFE_FF;

architecture top of DE10_LIFE_FF is

	begin
		--	Solicitação direta de componentes
		
		ff0:	work.ourjkff 
			port  map(
				clk => key(0), clr => not key(1), j => sw(3), k => sw(2), q => LEDR(2));
	
		ff1:	work.ourdff 
			port  map(
				clk => key(0), clr => not key(1), d => sw(1), q => LEDR(1));
		
		ff2:	work.ourtff		
			port  map(
				clk => key(0), clr => not key(1), t => sw(0), q => LEDR(0));
	end top;