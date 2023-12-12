-- Declaracao da ENTIDADE (entity)
-- 	Ela estabelece a interface do sistema digital com o mundo, ou seja, os pinos (sinais) de entrada e saida.
-- 	O nome da ENTIDADE deve ter tamanho maximo de 32 caracteres, sem pontuacao ou caracteres especiais.
-- 	Deve comecar por letra e pode incluir algarismos numericos e 'underline' (_).
-- 	O VHDL nao distingue entre maiuscula e minuscula ('case insensitive')
-- 
entity alu is
	port
	(
		-- Portas
		-- A sintaxe eh: NOME_DA_PORTA : MODO (in, out, inout) TIPO (bit, boolean, character, integer, real, time, bit_vector, string);
		-- Entrada(s)
		A, B		: in  bit_vector(3 downto 0);	-- Signals A e B do MODO de entrada (in) e do TIPO bit_vector
		ALUControl	: in  bit_vector(2 downto 0);		-- Signal ALUControl do MODO de entrada (in) e do TIPO bit_vector

		-- Saida(s)
		Result		: out bit_vector(3 downto 0);	-- Signal Result do MODO de saida (out) e do TIPO bit_vector de tamanho 3
		Zero		: out bit 							-- Signal Zero de MODO de saída (out) e do tipo bit
						-- A ultima declaracao de porta nao tem ponto e virgula (;)
	);
end alu;

-- Declaracao da ARQUITETURA (architecture)
-- 	Ela estabelece a relacao entre os pinos de entrada e de saida, ou seja, o circuito a ser implementado.
-- 	O nome da ARQUITETURA deve ter tamanho maximo de 32 caracteres, sem pontuacao ou caracteres especiais.
-- 	Deve comecar por letra e pode incluir algarismos numericos e 'underline' (_).
-- 	Cada ENTIDADE pode ter mais de uma ARQUITETURA, assim e necessario distingui-las por meio de um nome.

architecture estrutural of alu is	-- ARQUITETURA 'estrutural' associada aa ENTIDADE 'alu'
	
	-- Inicio da declaracao da ARQUITETURA
	
		signal muxSelection	: bit_vector(3 downto 0);
		signal not_B	: bit_vector(3 downto 0);	
		signal SUM	: bit_vector(3 downto 0);
		signal result_aux	: bit_vector(3 downto 0);


begin
	-- Para a implementacao da arquitetura da ALU, recomenda-se o uso da construção concorrente "Selected Signal Assignment":
	--<optional_label>: with <expression> select
	--<target> <= <value> when <choices>
	--			  <value> when <choices>
	--			  <value> when <choices>
	-- 		      ...
	--			  <value> when others;
	--tendo como <target> Result (ou Result_tmp), e como <expression> ALUControl
	
	-- Dicas:
	-- Como o resultado da operacao SLT e a saida ZERO depende de Result, recomenda-se criar um sinal intermediario (Result_tmp)
	--que armazena o valor das operacoes aritmetica e lógicas, ou zero para as operacoes nao definidas. Lembre-se de que para a
	--operacao SLT eh necessario calcular A-B para verificar se A eh menor do que B.
	-- Depois, utiliza-se Result_tmp para definir o valor final de Result e de Zero.
	-- O valor de ZeroExt pode ser obtido por "000" & Sum(3)
	
	not_B <= not B;
	
	
	
	-- i0 ->
	-- i1 -> 
	mux0: work.mux21 port map (I0 => B, I1 => not_B,s=> ALUControl(0), Z => muxSelection);
	
	adder0: work.adder port map (A => A, B => muxSelection, Cin=> ALUControl(0), RESULT => SUM);
	
	with ALUControl(2 downto 0) select
                result_aux <=  SUM		when "001" | "000",
									A and B	when "010",
									A	or	B	when "011",
									"000" & SUM(3)	when "101",							
                           "0000" 	when others;	
	Zero <= not (result_aux(0) or result_aux(1) or result_aux(2) or result_aux(3S));
	result <= result_aux;
end estrutural;