entity DE10_LITE_counter is
    port(
        key  : in bit_vector(1 downto 0);
        sw   : in bit_vector(7 downto 0);
        -- hex0 : out bit_vector(7 downto 0);
        LEDR : out bit_vector(9 downto 0)
    );
end DE10_LITE_counter;

architecture top of DE10_LITE_counter is
    signal q_out : bit_vector(3 downto 0);
begin
    counter0: work.counter
        generic map (
            n => 4
        )
        port map (
            clk => key(0),
            clr => not key(1),
            q   => q_out(3 downto 0)
        );

    -- disp0: work.hex27seg
    --    port map (
    --        hexa => q_out(3 downto 0),
    --        segments => hex0(6 downto 0)
    --    );

    LEDR(3 downto 0) <= q_out;
end top;