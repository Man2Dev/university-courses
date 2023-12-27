namespace codesAssembler
{
    public static class Program
    {

        private const string LOAD = "00";
        private const string ADD = "01";
        private const string SUB = "10";
        private const string JNZ = "11";
        private const string HLT = "000000";

        public static void Main(string[] args)
        {
            if (args.Length < 1)
            {
                Console.Write("Welcome CoDes Assembler.\nRun \"codes <path to file>\" to run the assembler.");
            }
            else
            {
                assembler(args[0]);
            }
        }

        private static void assembler(string path)
        {
            if (Path.EndsInDirectorySeparator(@path))
            {
                System.Console.WriteLine("Directory is invalid as a path to file.");
                return;
            }
            else if (Path.GetExtension(@path) != ".asb")
            {
                System.Console.WriteLine("Only a .asb file is valid.");
                return;
            }
            int counter = 0;
            string destination = Path.GetDirectoryName(@path) + "/" + Path.GetFileNameWithoutExtension(@path) + ".bytecode";
            File.WriteAllText(@destination, String.Empty);
            using StreamWriter file = new(destination, append: true);

            foreach (string line in System.IO.File.ReadLines(@path))
            {
                string[] inst = line.Split(' ');
                switch (inst[0].ToUpper())
                {
                    case "LOAD":
                        string instA0 = LOAD + regAssemble(inst[1]) + "11";
                        file.WriteLine(instA0);
                        string instA1 = Convert.ToString(Convert.ToInt16(inst[2]), 2).PadLeft(6, '0');
                        file.WriteLine(instA1);
                        break;
                    case "ADD":
                        instA0 = ADD + regAssemble(inst[1]) + regAssemble(inst[2]);
                        file.WriteLine(instA0);
                        break;
                    case "SUB":
                        instA0 = SUB + regAssemble(inst[1]) + regAssemble(inst[2]);
                        file.WriteLine(instA0);
                        break;
                    case "JNZ":
                        // TODO
                        break;
                    case "HLT":
                        file.WriteLine(HLT);
                        break;
                    default:
                        break;
                }
                counter++;
            }
        }

        private static string regAssemble(string regName)
        {
            if (regName == "R0")
            {
                return "00";
            }
            else if (regName == "R1")
            {
                return "01";
            }
            else if (regName == "R2")
            {
                return "10";
            }
            else
            {
                return "11";
            }
        }
    }
}