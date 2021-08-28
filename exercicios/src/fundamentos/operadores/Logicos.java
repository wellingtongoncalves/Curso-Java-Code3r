package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = false;
		boolean condicao2 = 67 >= 67;
		
		System.out.println(condicao1 && condicao2); // F 
		System.out.println(condicao1 || condicao2); // V
		System.out.println(condicao1 ^ condicao2); // V
		System.out.println(!condicao1 ); // V
		System.out.println(!condicao2); // FALSE
		
		
	}
}



