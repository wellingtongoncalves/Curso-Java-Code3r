package fundamentos;

public class Demo {

		 String linguagem = "JAVA";
		
		public void desvio (){    
			switch ( linguagem ) {
				case ( "C" ):
						System.out.println("Suporta apenas programa��o estruturada");
						break;
				case ( "C++" ):
						System.out.println("Suporta programa��o estruturada e orientada a objeto");
						break;
				case ( "JAVA "):
						System.out.println("Suporta apenas programa��o orientada a objeto");
						break;
				default:
						System.out.println("Erro!");
						break;
			}
		}

	}

