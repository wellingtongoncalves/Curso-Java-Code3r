package fundamentos;

public class LoopWhile {

	public static void main(String[] args) {
		int x = 2;
		System.out.println("Antes do loop ");
		while (x < 7) {
			System.out.println("No loop ");
			System.out.println("O valor de x � " + x);
			x = x + 1;
		}
		
		System.out.println("Esse � o fim do loop");
	}

}
