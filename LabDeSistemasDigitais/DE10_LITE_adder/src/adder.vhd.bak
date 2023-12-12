entity adder is 

	port
	(
		A,B		:	in		bit_vector(3 downto 0);
		RESULT	:	out	bit_vector(3 downto 0)
	);
end adder;

architecture modular of DE10_LITE_adder is

	signal	C	:	bit_vector(3 downto 1);
begin

	fa0	:	 work.fadder port map(a => A(0),	b => B(0),	ci =>	'0',	s=> RESULT(0),	co=>C(1));
	fa1	:	 work.fadder port map(a => A(1),	b => B(1),	ci =>	C(1),	s=> RESULT(1),	co=>C(2));
	fa2	:	 work.fadder port map(a => A(2),	b => B(2),	ci =>	C(1),	s=> RESULT(2),	co=>C(3));
	fa3	:	 work.fadder port map(a => A(3),	b => B(3),	ci =>	C(1),	s=> RESULT(3));
end modular;