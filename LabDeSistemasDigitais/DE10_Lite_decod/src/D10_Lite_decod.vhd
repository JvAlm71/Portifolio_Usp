entity D10_Lite_decod is

port
	(
		sw : in bit_vector(9 downto 0);
		HEX0 : out bit_vector(7 downto 0)
	);
	
end D10_Lite_decod;

architecture logica of D10_Lite_decod is 

component hex27seg 
port
	(
	hexa : in bit_vector(3 downto 0);
	seg : out bit_vector(6 downto 0)
	);
end component;

begin

	hexa0 : hex27seg port map (hexa => sw(3 downto 0), seg => HEX0(6 downto 0));
	HEX0(7) <= '0';

end; 