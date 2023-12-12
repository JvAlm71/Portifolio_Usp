entity counter is
	generic(n	:	integer	:=	8);
	
	port
	(
		

			clk,	clr	:	in	bit;
			q				:	out	bit_vector(n-1 downto 0)
	);
end counter;
	
architecture rtl of counter is
	


	signal t, q_temp: bit_vector(n-1 downto 0);

begin

		t(0) <= '1';
		tff_0:work.ourtff 
				port map (
					clk	=>	clk,
					clr	=>	clr,
					t 		=>	t(0),
					q		=>	q_temp(0)
					);
					
		gen: for i in 1 to n-1 generate
		t(i) <= q_temp(i-1) and t(i-1);
			tff_i:work.ourtff 
				port map (
					clk	=>	clk,
					clr	=>	clr,
					t 		=>	t(i),
					q		=>	q_temp(i)
					);
		
       end generate gen;

    q <= q_temp;
end rtl;