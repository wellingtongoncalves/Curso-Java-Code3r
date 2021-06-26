package fundamentos;

public class Temperatura {
			
		public static void main(String[] args) {
			// (°F - 32 ) x 5/9 = °C
			double farenheit  = 86;
			final double AJUSTE = 32;
			final double FATOR = 5 / 9.0;
			double c = ((farenheit - AJUSTE ) * FATOR );
			System.out.println("O resultado é " + c + " °C.");// ALT + DIRECIONAL PRA BAIXO OU PRA CIMA MOVE A LINHA
			System.out.println("O resultado é " + c + " °C."); // CTRL + ALT + DIRECIONAL PRA BAIXO OU PRA CIMA. DUPLICA A LINHA.
			System.out.println("O resultado é " + c + " °C.");
			System.out.println("O resultado é " + c + " °C."); // CTRL + ALT + DIRECIONAL PRA BAIXO OU PRA CIMA. DUPLICA A LINHA.
			
		}
}
