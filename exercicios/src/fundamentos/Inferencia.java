/*package fundamentos;

public class Inferencia {
	
		public static void main(String[] args) {
			
			double a = 4.5;
			System.out.println(a);
			
			var b = 4.5;
			System.out.println(b);
			
			var c = "Texto";
			c = "Outro texto ";
			System.out.println(c);
		}
}
*/

package fundamentos;

public class Inferencia {
	
		public static void main(String[] args) {
			
			double a = 4.5; // varia��o foi declarada e inicializada
			System.out.println(a);
			
			a = 12;
			System.out.println(a);
			
			// a = "...." nessa linha n�o se pode mudar o tipo da vari�vel para string porque na linha 26 ela foi declarada como double		
			
			var b = 4.5;
			System.out.println(b);
			
			var c = "Texto";
			System.out.println(c);
			
			c = "Outro texto ";
			System.out.println(c);
			
			// c = 4.5;
			
			double d; // vari�vel foi declarada 
			d = 123.65; // vari�vel foi inicializada
			System.out.println(d); // usada!
			
			var e = 123.45;
			System.out.println(e);
		
			
		}
}
