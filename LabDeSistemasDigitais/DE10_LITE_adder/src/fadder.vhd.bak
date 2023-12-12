entity fadder is 

	port
	(
		a,b,ci	:	in	bit;
		s,co	:	out	bit
	);
end fadder;

architecture concorrente of fadder is 

	signal ent :	bit_vector(2 downto 0);
	
begin
	
	ent <= a & b & ci;
	
	with ent select	
		s	<=	'1' when "010",
				'1' when "100",
				'1' when "001",
				'1' when "111";
				
		
		ci	<=	'1'	when	"110" else
				'1'	when	"011" else
				'1'	when	"101" else
				'1'	when	"111" else
				'0';
						
		
			
	
end concorrente;