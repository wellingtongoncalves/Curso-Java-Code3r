package fundamentos.operadores;

public class TiposPrimitivos {
		
		public static void main(String[] args) {
			// Informa��es do funcion�rio
			
			// Tipos num�ricos inteiros
			byte anosDeEmpresa = 23;
			short numerosDeVoos = 542;
			int id = 56789;
			long pontosAcumulados = 3_134_845_223L;
			
			//Tipos num�ricos reais
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
			
			//Tipo booleano
			boolean estaDeFerias = false; // true
			
			//Tipo caractere
			char status = 'A'; // ativo
			
			// Dias de empresa
			System.out.println(anosDeEmpresa * 365);
			
			// N�mero de viagens 
			System.out.println(numerosDeVoos / 2 );
			
			// Pontos por real
			System.out.println(pontosAcumulados / vendasAcumuladas);
			
			System.out.println(id + ": ganha -> " + salario);
			System.out.println("F�rias ? " + estaDeFerias);
			System.out.println("Status: " + status);
			System.out.println("A B C D E F G ".toCharArray());
			System.out.println("Aula de Java".split(" "));
			System.out.println("Aula".concat("de Java "));
			System.out.println("1234 asda qw".replaceAll("[0-9]", "[#]"));
			
		}
	
}
