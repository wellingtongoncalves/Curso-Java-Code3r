package fundamentos;

public class Booleano {
			public static void main(String[] args) {
				int salario  = 4; // atribui 1000 a salario
				while (salario >=  3) {
					// o c�digo do loop ser� executado porque
					//salario � maior que 3
					salario = salario - 1 ;  // ou ficar�amos eternamente no loop
					System.out.println(salario);
				}
			}
}
