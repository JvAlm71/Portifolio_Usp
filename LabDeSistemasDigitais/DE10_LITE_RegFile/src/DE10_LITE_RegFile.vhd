entity DE10_LITE_RegFile is
	port
	(
		KEY	:	in	bit_vector(1 downto 0);
		SW		:	in	bit_vector(9 downto 0);
		LEDR	:	out	bit_Vector(9 downto 0)
		 -- m quantidade de resgistrador
	    -- n quantidade de bits do dado
		
	);
end DE10_LITE_RegFile;

architecture top of DE10_LITE_RegFile is

begin
	regfile0:	work.regfile
						generic map(
							N => 4,
							M => 2
						)
						port map(
							clk	=> KEY(0),
							WE3	=> not KEY(1),
							A1		=> SW(1 downto 0),
							A2		=> SW(3 downto 2),
							A3		=> SW(5 downto 4),
							WD3	=> SW(9 downto 6),
							RD1	=> LEDR(3 downto 0),
							RD2	=> LEDR(7 downto 4)
						);

end top;