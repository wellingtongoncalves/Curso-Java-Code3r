package fundamentos;

public class TipoString2 {
		public static void main(String[] args) {
			System.out.println("Boa Noite".equals("Wellington")); // false
			System.out.println("Boaaa Noite".endsWith("Zée")); // false
			System.out.println("Tbm".equals("Tbm")); // true
			System.out.println("Beleza".concat(" Well")); //Beleza Well
			System.out.println("Olá Mundo!!" .charAt(4)); // M
			
			String a = "Wellington Da Presbiteriana";
			 a.replace("Well", "Wall"); // Somente nesta parte do código foi trocada o valor da String
			  a=a.replace("Well", "Wall"); // Aqui o valor foi trocado porque a = a.replace
					System.out.println(a.startsWith("Wall")); //true
					System.out.println(a.startsWith("Well")); //false
					System.out.println(a.length()); //false
					System.out.println(a.endsWith("a")); //false
					System.out.println(a.charAt(2));
					System.out.println(a.compareTo("verde"));
					System.out.println(a.equals("Free"));
					System.out.println(a.equalsIgnoreCase("Free"));
					
					var nome = "TON";
					var logradouro = 450;
					var salario = 12333.877;
					
					System.out.printf("O rapaz %s mora na casa número %d e ganha um salario de %.2f \n" ,nome , logradouro , salario);
					String frase = String.format("Vamo pra cima meu bom  ");
					System.out.println(frase);
					
					
			
			
		}
}
