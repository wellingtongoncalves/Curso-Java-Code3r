package fundamentos;

import java.util.Scanner;

public class Numeros {
		
		public static void main(String[] args) {
			 
			int numero, soma = 0;
			String resp;
			Scanner teclado = new Scanner (System.in);
			do {
				System.out.print("Digite um n�mero: ");
				numero = teclado.nextInt();
				soma += numero;
				System.out.println("Quer continuar? [S/N] ");
				resp = teclado.next();
			}while (resp.equals("S"));
			System.out.println("A soma de todos os valores � " + soma );
		}
	
	
}
