package fundamentos;

public class CancaoDaAgua {

	public static void main(String[] args) {
		
		int aguaNum = 99;
		String palavra = "garrafas";
		
		while (aguaNum > 0 ) {
			
			if (aguaNum > 0 ) {
				palavra = "garrafas"; // no singular, como em uma garrafa.
			}
			
			System.out.println(aguaNum + " " + palavra +  " de água na parede " );
			System.out.println(aguaNum + " " + palavra +  " de água " );
			System.out.println(aguaNum + " " + palavra +  " Derrube um " );
			System.out.println(aguaNum + " " + palavra +  " Passe adiante " );
			aguaNum = aguaNum -1;
			
			if (aguaNum > 0 ) {
				System.out.println(aguaNum + "  " + palavra + " de água na parede ");
			} else {
				System.out.println(" Não há mais garrafas de água na parede ");
			} // fim de else
			
		} // fim do loop while

	} // fim do método main 

} // fim da classe
