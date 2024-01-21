library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity MIPS is
    Port ( clk : in  STD_LOGIC;
				reset : in std_logic;
				memwrite : out std_logic;
           readdata : in  STD_LOGIC_VECTOR (31 downto 0);
			  address : out  STD_LOGIC_VECTOR (31 downto 0);
           writedata : out  STD_LOGIC_VECTOR (31 downto 0));
end MIPS;

architecture Behavioral of MIPS is

	--COMPONENT PC
	--PORT(
	--	clk : IN std_logic;
	--	reset : IN std_logic;
	--	din : IN std_logic_vector(31 downto 0);          
	--	dout : OUT std_logic_vector(31 downto 0)
	--	);
	--END COMPONENT;

	COMPONENT Instruction_Memory
	PORT(
		dir : IN std_logic_vector(31 downto 0);          
		instr : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	COMPONENT ALU
	PORT(
		a : IN std_logic_vector(31 downto 0);
		b : IN std_logic_vector(31 downto 0);
		func : IN std_logic_vector(2 downto 0);          
		zero : out std_logic;
		rslt : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	COMPONENT SignExtend
	PORT(
		din : IN std_logic_vector(15 downto 0);          
		dout : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	COMPONENT Mux_2to1_32b
	PORT(
		ctrl : IN std_logic;
		A : IN std_logic_vector(31 downto 0);
		B : IN std_logic_vector(31 downto 0);          
		O : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	COMPONENT corrimiento
	PORT(
		din : IN std_logic_vector(31 downto 0);          
		dout : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	COMPONENT ALU_suma
	PORT(
		a : IN std_logic_vector(31 downto 0);
		b : IN std_logic_vector(31 downto 0);          
		sal : OUT std_logic_vector(31 downto 0)
		);
	END COMPONENT;
	
	
	COMPONENT Mux_2to1_5bits
	PORT(
		ctrl : IN std_logic;
		a : IN std_logic_vector(4 downto 0);
		b : IN std_logic_vector(4 downto 0);          
		sal : OUT std_logic_vector(4 downto 0)
		);
	END COMPONENT;
		
	
	--signal memtoreg,branch,alusrc,regdst,regwrite,jump,zero : std_logic;
	--signal aluctrl : std_logic_vector(2 downto 0);
	
	--signal rst_pc : std_logic;
	--signal pc_in,pc_out,instr: std_logic_vector(31 downto 0);
	
	--alias code_op : std_logic_vector(5 downto 0) is instr(31 downto 26);
	--alias funct : std_logic_vector(5 downto 0) is instr(5 downto 0);
	
	--alias rs : std_logic_vector(4 downto 0) is instr(25 downto 21);
	--alias rt : std_logic_vector(4 downto 0) is instr(20 downto 16);
	--alias rd : std_logic_vector(4 downto 0) is instr(15 downto 11);
	--alias shamt : std_logic_vector(4 downto 0) is instr(10 downto 6);
	--alias inmd : std_logic_vector(15 downto 0) is instr(15 downto 0);
	--alias addr : std_logic_vector(25 downto 0) is instr(25 downto 0);
	
	--signal pc_out_next: std_logic_vector(31 downto 0);
	--signal sal_rt_o_rd : std_logic_vector(4 downto 0);
	
	--signal srca,srcb,rd2,alu_result,extsig_out : std_logic_vector(31 downto 0);
	--signal despl_out,pc_branch,result_mem : std_logic_vector(31 downto 0);
	
	--signal addr32,addr32_corri,addr32_pc_next,pc_next_j : std_logic_vector(31 downto 0);
	
	--signal pcsrc : std_logic;
begin
	
	Inst_Instruction_Memory: Instruction_Memory PORT MAP(
		dir => pc_out,
		instr =>instr
	);
	
	
	ALU_suma_4: ALU_suma PORT MAP(
		a => pc_out,
		b => x"00000004",
		sal => pc_out_next
	);
	
	Inst_ALU: ALU PORT MAP(
		a => srca,
		b => srcb,
		func => aluctrl,
		zero=> zero,
		rslt => alu_result
	);
	
	Inst_SignExtend: SignExtend PORT MAP(
		din => inmd,
		dout => extsig_out
	);
	
	Inst_Mux_extSign_o_red2: Mux_2to1_32b PORT MAP(
		ctrl => alusrc,
		A => rd2,
		B => extsig_out,
		O => srcb
	);
	
	Inst_corrimiento: corrimiento PORT MAP(
		din => extsig_out,
		dout => despl_out
	);
	
	
	ALU_suma_desplaz: ALU_suma PORT MAP(
		a => despl_out,
		b => pc_out_next,
		sal => pc_branch
	);
	
	
end Behavioral;

