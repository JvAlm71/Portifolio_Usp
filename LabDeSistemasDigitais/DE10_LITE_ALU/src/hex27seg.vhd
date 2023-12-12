-- Projeto decodificador Haxadecimal para 7 Segmentos
-- Aula 06 - SEL0384/SEL0606
-- Professor: Maximiliam Luppe
-- Data: 04/10/2023

entity hex27seg is
	port (
		hexa : in bit_vector(3 downto 0);
		segments : out bit_vector(6 downto 0)
	);
end hex27seg;

architecture logica of hex27seg is

	-- Sinais auxiliares que receberão o valor e o complemento de hexa(3 downto 0)
	signal b, nb: bit_vector(3 downto 0);

	-- Inicio da declaracao da ARQUITETURA
begin
	-- A atribuicao do valor para cada objeto da classe signal eh realizada por meio do operador atribuicao de sinal (<=)
	b(3) <= hexa(3);
	b(2) <= hexa(2);
	b(1) <= hexa(1);
	b(0) <= hexa(0);
	nb(3) <= not b(3);                  
	nb(2) <= not b(2);
	nb(1) <= not b(1);             
	nb(0) <= not b(0);

	-- Para cada uma das saidas sera atribuida uma expressao booleana baseada nos operadores logicos E (and) OU (or) e NAO (not).
	segments(0) <= not((b(3) or b(2) or b(1) or nb(0)) and (b(3) or nb(2) or b(1) or b(0)) and (nb(3) or nb(2) or b(1) or nb(0)) and (nb(3) or b(2) or nb(1) or nb(0))); -- Escrita na forma de produto de somas
	segments(1) <= not((nb(3) and nb(2)) or (nb(2) and nb(0)) or (nb(3) and nb(1) and nb(0)) or (nb(3) and b(1) and b(0)) or (b(3) and nb(1) and b(0)));
	segments(2) <= not((b(3) or b(2) or nb(1) or b(0)) and (nb(3) or nb(2) or b(1) or b(0)) and (nb(3) or nb(2) or nb(1)));
	segments(3) <= not((b(3) or b(2) or b(1) or nb(0)) and (b(3) or nb(2) or b(1) or b(0)) and (nb(3) or b(2) or nb(1) or b(0)) and (nb(2) or nb(1) or nb(0)));
	segments(4) <= not((nb(2) and nb(0)) or (b(3) and b(2)) or (b(1) and nb(0)) or (b(3) and b(1)));
	segments(5) <= not((nb(1) and nb(0)) or (b(3) and nb(2)) or (b(3) and b(1)) or (nb(3) and b(2) and nb(1)) or (nb(3) and b(2) and nb(0)));
	segments(6) <= not((b(3) or b(2) or b(1)) and (nb(3) or nb(2) or b(1) or b(0)) and (b(3) or nb(2) or nb(1) or nb(0)));

end;
