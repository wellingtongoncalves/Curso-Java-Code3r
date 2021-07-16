package fundamentos;

public class Booleano {
			public static void main(String[] args) {
				int salario  = 4; // atribui 1000 a salario
				while (salario >=  3) {
					// o código do loop será executado porque
					//salario é maior que 3
					salario = salario - 1 ;  // ou ficaríamos eternamente no loop
					System.out.println(salario);
				}
			}
}
