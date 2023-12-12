entity ourdff is
	port(
		clk			: in bit;
		clr			: in bit;
		d				: in bit;
		q				: out bit
	);
end ourdff;

architecture rtl of ourdff is

begin
	process(clk,clr)
			begin
			-- sinal assincrono de reset positivo
				if(clr='1') then
					q	<=	'0';
						--	 detecçãode borda clk
				elsif (clk'event and clk = '1') then
					q	<=	d;
				end if;
			end process;
		
end rtl;