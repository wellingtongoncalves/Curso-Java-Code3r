package fundamentos;

	import java.io.IOException;
	import java.util.Scanner;

	import java.io.IOException;
	import java.util.Scanner;

		public class Desafio {
			
		    public static void main(String[] args) throws IOException {
		        Scanner leitor = new Scanner(System.in);
		        float x;
		        int cont = 0;

		//continue a solucao de acordo com o solicitado no enunciado

		      for(var i=0 ; i < 6 ; i++) {
		      x = leitor.nextFloat();
		      if ( x > 0) {
		        cont++;
		      }
		      System.out.println(cont+" "+"valores positivos");
		      }
		    }
		}
		
	
