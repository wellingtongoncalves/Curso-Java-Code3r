package fundamentos;

public class CancaoDaAgua {

	public static void main(String[] args) {
		
		int aguaNum = 99;
		String palavra = "garrafas";
		
		while (aguaNum > 0 ) {
			
			if (aguaNum > 0 ) {
				palavra = "garrafas"; // no singular, como em uma garrafa.
			}
			
			System.out.println(aguaNum + " " + palavra +  " de �gua na parede " );
			System.out.println(aguaNum + " " + palavra +  " de �gua " );
			System.out.println(aguaNum + " " + palavra +  " Derrube um " );
			System.out.println(aguaNum + " " + palavra +  " Passe adiante " );
			aguaNum = aguaNum -1;
			
			if (aguaNum > 0 ) {
				System.out.println(aguaNum + "  " + palavra + " de �gua na parede ");
			} else {
				System.out.println(" N�o h� mais garrafas de �gua na parede ");
			} // fim de else
			
		} // fim do loop while

	} // fim do m�todo main 

} // fim da classe
