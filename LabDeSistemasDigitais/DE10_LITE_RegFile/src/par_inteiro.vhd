entity par_inteiro is
	generic
	(
			wordSize : integer := 16
	);
	port
	(
	
		input_signal	:	in	bit_vector(wordSize-1 downto 0);
		
		inteiro				:	out integer
		 -- m quantidade de resgistrador
	    -- n quantidade de bits do dado
		
	);
end par_inteiro;

architecture top of par_inteiro is

begin
	process (input_signal)
		variable temp : integer;
		begin
		temp :=0;
		for i in wordSize-1 downto 0 loop
			if input_signal(i)='1' then
				temp := temp + 2**i;
			end if;
		end loop;
		inteiro <= temp;
	end process;
end top;