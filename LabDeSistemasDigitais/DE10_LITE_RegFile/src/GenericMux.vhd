type bit_vector_array is array (natural range <>) of bit_vector;
entity GenericMux is
    generic (
        N : integer := 2; -- Number of selection bits
        M : integer := 4; -- Number of data inputs (2^N)
        W : integer := 8  -- Width of each bit_vector in the array
    );
    port (
        sel      : in  bit_vector(N-1 downto 0); -- Selection lines
			data_in  : in  bit_vector_array(0 to M-1)(W-1 downto 0); -- Data inputs
        data_out : out bit_vector(W-1 downto 0)                      -- Data output
    );
end GenericMux;

architecture Behavioral of GenericMux is
begin
    process(sel, data_in)
    variable sel_index : integer;
    begin
        -- Convert selection lines to integer
        sel_index := 0;
        for i in 0 to N-1 loop
            if sel(i) = '1' then
                sel_index := sel_index + (2**i);
            end if;
        end loop;

        -- Select the corresponding data input
        if sel_index < M then
            data_out <= data_in(sel_index);
        else
            data_out <= (others => '0'); -- Default output if selection is out of range
        end if;
    end process;
end Behavioral;