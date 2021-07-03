package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Aula de strings ".charAt(2)); // l

		String s = "Boa Tarde";
		// s = s.toUpperCase(); // Boa Tarde!!!!!!
		System.out.println(s.concat("!!!!!!"));
		System.out.println(s + "!!!!!!"); // Boa Tarde!!!!!!
		System.out.println(s.startsWith("Boa")); // true
		System.out.println(s.startsWith("b")); // false
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.length()); //9 
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Wellington";
		var sobrenome = "Gonçalves";
		var idade = 33;
		var salario = 12345.987; // double 

		System.out.println("Nome: " + nome + " \n Sobrenome: " + sobrenome);
		System.out.println("Nome: " + nome + " \n Sobrenome: " 
		+ sobrenome + "\n Idade: " + idade + 
		"\nSalario: " + salario + "\n\n");

		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", 
		nome,sobrenome,idade,salario); 
		// %s é o elemento responsável por referenciar a variável do tipo string e o %d é para inteiros e %f é flutuante.

		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", 
		nome,sobrenome,idade,salario);
		System.out.println(frase);

		System.out.println("Wellington".contains("Well"));
		System.out.println("Wellington".indexOf("i"));
		System.out.println("Wellington".substring(6)); //gton
		System.out.println("Wellington".substring(6,9)); //gto
		
		




	}
}
