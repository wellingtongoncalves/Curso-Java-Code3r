/*package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia B  " ;
		s = s.toUpperCase();
		s = s.replace("B", "Senhora");
		
		System.out.println(s);

	}

}*/

package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		/*String s = "Bom dia C";
		s = s.toUpperCase();
		s = s.replace("BOM", "Well");*/
		// BOM DSenhoraA C
		//BSenhoraM DIA C
		// Well DIA C 
		String s = "BoM dia x";
		s = s.replace("M", "Well"); //Wellom dia x ou BOWELL DIA X!!!
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		
		System.out.println(s);
		String x = "Well".toUpperCase();
		System.out.println(x);
		//System.out.println("Well".toUpperCase());
		
		String y = "Bom dia G ".replace("G", "Ton");
		System.out.println(y);
		
		String j = "Boa Tarde W ".replace("W", "Wellington");
		System.out.println(j);
		
		String k = "Boa noite MANO".replace("MANO", "IRM√O")
				.toLowerCase()
				.concat(y);//boa noite irm„oBom dia Ton 
		System.out.println(k);
		
		// Tipos primitivos n√£o tem o operador "."
				int a = 3;
				System.out.println(a);

		
		
		
		
	}
}

