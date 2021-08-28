package fundamentos.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*
		int zoom,flash,f_reverso;
		zoom = 5;
		flash = 9;
		f_reverso = 7;
		boolean r;
		r = (zoom<flash && flash<f_reverso) ? true:false;
		System.out.println(r);
		
		
		int zoom,flash,f_reverso;
		zoom = 15;
		flash = 9;
		f_reverso = 9;
		boolean r;
		r = (zoom != flash || flash ==  f_reverso) ? true:false;
		System.out.println(r);
		
		
		int zoom,flash,f_reverso;
		zoom = 15;
		flash = 91;
		f_reverso = 9;
		boolean r;
		r = (zoom == flash ^ flash >=  f_reverso) ? true:false;
		System.out.println(r);
	
		int idade = 17 ;
		boolean votar;
		votar = (idade >=16 && idade < 18 || idade > 70) ? true:false;
		System.out.println("O voto é opcional ?  "+ votar);
		*/
		int idade = 34 ;
		String si = (idade >=16 && idade < 18 || idade > 70) ? "É OPCIONAL":"É OBRIGATÓRIO";
		System.out.println("O voto é opcional ?  "+ si);
		
		
		
	}

}
