package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		// double a = 2.3;
		//String s = "Bom dia X";
		//s = s.replace("X", "Senhor"); // troque Letra Mai�scula X pela palavra Senhor
		//s = s.toUpperCase(); // depois converta toda string para mai�scula. BOM DIA SENHOR
		//s = s.replace("X", "Senhor");
		//System.out.println(s);
		
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhor"); 
		s = s.toUpperCase(); 
	    s = s.concat("!!!"); 
	    
		System.out.println(s);// NO FINAL O C�D FICA ASSIM (BOM DIA SENHOR!!!)
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X "
				.replace("X", "Gui")
				.toUpperCase()
				.concat(s); // ou .concat("!!!!!!!!----");
				
		System.out.println(y);
		
		
		// Tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
	}
}
