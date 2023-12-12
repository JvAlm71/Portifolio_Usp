library work;

entity regfile is
	generic
	(
			N: integer := 16;	--	quantos bit cada registrador
			M: integer := 4 	-- 32 --  log da quantide de registradores
	);
	port
	(
		clk	:	in	bit;
		WE3	:	in	bit;
		A1		:	in	bit_vector(M-1 downto 0);
		A2		:	in	bit_vector(M-1 downto 0);
		A3		:	in	bit_vector(M-1 downto 0);
		WD3	:	in		bit_vector(N-1 downto 0);
		RD1	:	out	bit_vector(N-1 downto 0);
		RD2	:	out	bit_vector(N-1 downto 0)
		
	);
end regfile;

architecture rtl of regfile is
	
	type  array_reg is array (2**M-1 downto 0) of bit_vector(N-1 downto 0);
	
	component  par_inteiro
		generic
		(
				wordSize : integer
		);
		port
		(
		
			input_signal	:	in	bit_vector(wordSize-1 downto 0);
			
			inteiro				:	out integer
			 -- m quantidade de resgistrador
			 -- n quantidade de bits do dado
			
		);
		end component;
		
	component  reg
					generic
					(
					n	:	integer
					);
				port	(

					clk,clr,en	:	in bit;
					d				:	in bit_vector(n-1 downto 0);
					q				:	out bit_vector(n-1 downto 0)
					);
		end component;

	signal arrayIntermediate	: array_reg;
	signal enables					: bit_vector(2**M-1 downto 0);
	
	-- signal output : bit_vector(n-1 downto 0);
	
	signal write1, read2, read3 : integer;
	
begin
		parA1 : par_inteiro 
			generic map 
			(
				wordSize => M
			) 
			port map
			(
				input_signal => A1,
				inteiro => write1
			);
			
		parA2 : par_inteiro 
			generic map 
			(
				wordSize => M
			) 
			port map
			(
				input_signal => A2,
				inteiro => read2
			);
		parA3 : par_inteiro 
			generic map 
			(
				wordSize => M
			) 
			port map
			(
				input_signal => A3,
				inteiro =>read3
			);

		heyOh : for i in 2**M -1 downto 0 generate 
		
			regX : reg 
				generic map	
				(
					N
				)
				port map
				(
					clk=> clk,
					clr=>'0',
					en => enables(i),
					d	=> WD3,
					q	=> arrayIntermediate(i)
			
				);
			enables(i) <= WE3 when (i = write1) else '0';
		
		end generate;
		
		RD1 <=  arrayIntermediate(read2);
		RD2 <= arrayIntermediate(read3);
		
end rtl;