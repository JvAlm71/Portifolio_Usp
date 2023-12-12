entity DE10_LITE_adder is 

	port
	(
		SW		:	in		bit_vector(9 downto 0);
		LEDR	:	out	bit_vector(9 downto 0)
	);
end DE10_LITE_adder;

architecture top of DE10_LITE_adder is

begin

	adder0: work.adder port map(s
	
		A => 			SW(3 downto 0),
		B => 			SW (7 downto 4),
		RESULT => 	LEDR(3 downto 0)
	);

end top;s