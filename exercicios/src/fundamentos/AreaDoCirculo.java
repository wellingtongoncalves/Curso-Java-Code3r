package fundamentos;
import java.util.Scanner; 

public class AreaDoCirculo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double
		 double raio = 60.6;
		 double area = 3.14159;

                  //continue a solucao

		area = 3.14159 * (Math.pow(  raio  ,2));

		System.out.printf("A=%.4f\n", area);
	}
}