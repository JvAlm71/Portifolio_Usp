entity ourjkff is
	port(
		clk,clr, j, k	:	in bit;
		q					:	buffer bit
	);
end ourjkff;

architecture rtl of ourjkff is

begin
	process(clk,clr)
			begin
			-- sinal assincrono de reset positivo
				if(clr='1') then
					q	<=	'0';
						--	 detecçãode borda clk
				elsif (clk'event and clk = '1') then
						-- equação caracteristica do flipflop desenvolvido aqui
					q	<=	((not Q) or j) and ((not k) or Q);
				end if;
			end process;
		
end rtl;