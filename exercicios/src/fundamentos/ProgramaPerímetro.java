package fundamentos;

import java.util.Scanner;

public class ProgramaPerímetro {
	public static void main(String[] args) {		
		final double RAIO;
		try(Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o raio: ");
			RAIO = entrada.nextDouble();
		}
		System.out.format("Perímetro = %.2f%n", 2*Math.PI*RAIO);
	}
}