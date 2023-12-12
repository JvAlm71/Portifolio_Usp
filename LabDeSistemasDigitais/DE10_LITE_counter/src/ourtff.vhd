entity ourtff is
	port(
		clk,clr, t	:	in bit;
		q				:	buffer bit
	);
end ourtff;

architecture rtl of ourtff is

begin
	process(clk,clr)
			begin
			-- sinal assincrono de reset positivo
				if(clr='1') then
					q	<=	'0';
						--	 detecçãode borda clk
				elsif (clk'event and clk = '1') then
						-- equação caracteristica do flipflop desenvolvido aqui
					q	<=	((not Q) or t) and ((not t) or Q);
				end if;
			end process;
		
end rtl;