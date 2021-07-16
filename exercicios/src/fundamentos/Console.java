package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print(" Dia! \n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		System.out.printf("O nome do filme �:  %d  %d  %d  %d %d %d %n",1,2,3,4,5,6); // printf � para saida formatada // %d = valores inteiros
		System.out.printf("Sal�rio:  %.1f%n" , 1234.5678);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n", 
				nome,sobrenome,idade);
		
		entrada.close();
		
		//System.out.println("\n \nNome = " + nome + "  " + sobrenome );
		
		
		
	}

}
