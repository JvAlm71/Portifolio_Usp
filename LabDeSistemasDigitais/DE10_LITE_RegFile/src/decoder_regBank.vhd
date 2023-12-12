entity decoder_regBank is	
	generic
		(
		n	:	integer	:=32
		);
	port	(

		binary_in				:	in bit_vector(n-1 downto 0);
		one_hot_out			:	out bit_vector(2**n-1 downto 0)
		);
end decoder_regBank;

architecture rtl of decoder_regBank is
begin
   process(binary_in)
    variable index : integer;
    begin
        -- Initialize output to zero
        one_hot_out <= (others => '0');

        -- Convert binary input to integer index
        index := 0;
        for i in 0 to N-1 loop
            if binary_in(i) = '1' then
                index := index + (2**i);
            end if;
        end loop;

        -- Set the corresponding output bit
        if index < (2**N) then
            one_hot_out(index) <= '1';
        end if;
    end process;
  			
end rtl;