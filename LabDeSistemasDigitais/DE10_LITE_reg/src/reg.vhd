entity reg is	
	generic
		(
		n	:	integer	:=32
		);
	port	(

		clk,clr,en	:	in bit;
		d				:	in bit_vector(n-1 downto 0);
		q				:	out bit_vector(n-1 downto 0)
		);
end reg;
architecture rtl of reg is
begin

	--abc:	for i in d'range generate
	--	dff1:	work.d_ffS(clk,	clr,	en,	d(i),	q(i))
	--end abc;
	abc: process (clk, clr)
		begin
			if(clr='1') then
				--o q recebe "000...000"
				def:FOR	I	IN	Q'RANGE	loop
					q(i)	<=	'0';
				end loop;
					--	another solution is:
					--q <= (others => '0'); --utilizando agregados
				elsif(clk'event and clk = '1') then -- borda de subida
					if(en = '1') then
						q <= d;
						end if;
				end if;
	end process;
			
end rtl;