package fundamentos;

public class IfCompostoExemplo2 {

	public static void main(String[] args) {
		int media = 6;
		String status;
		if (media < 6) {
			status = "Aprovado";
		}else {
			status = "Reprovado";
		}
		System.out.println(status);
	}

}
