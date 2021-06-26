package fundamentos;

public class AreaCircunferencia {
		
		public static void main(String[] args) {
			double raio = 3.4;
			final double pi = 3.14159;
			/*
			 * ou
			 * double area = PI * raio * raio;
			 * System.out.println(area);
			 * raio = 10;
			 * area = PI * raio * raio;
			 * System.out.println("Área= " + area + "m2.");
			 */ 
			System.out.println(pi*raio*raio);
		}
}
