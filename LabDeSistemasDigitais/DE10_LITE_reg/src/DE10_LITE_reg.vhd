entity DE10_LITE_reg is
port	(

		SW		:	in bit_vector(9 downto 0);
		KEY	:	in bit_vector(1 downto 0)	;
		LEDR	:	out bit_vector(9 downto 0)
);
end DE10_LITE_reg;
architecture top of DE10_LITE_reg is
begin

	reg0	:	work.reg
		generic map (n => 8)
		port map (
		clk	=> key(0),
		clr	=> not key(1),
		en		=> sw(9),
		d		=> sw(7 downto 0),
		q		=> LEDR(7 downto 0));
end top;