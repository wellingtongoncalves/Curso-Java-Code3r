package fundamentos;

class BaseDois {
	public static void main(String args[]) {
		int mes = 4; 
		String trimestre;
		if ( mes == 1 || mes == 2 || mes == 3 )
				trimestre = "Primeiro";
		else if ( mes == 4 || mes == 5 || mes == 6 )
				trimestre = "Segundo";
		else if ( mes == 7 || mes == 8 || mes == 9 )
			trimestre = "Terceiro";
	else if ( mes == 10 || mes == 11 || mes == 12)
			trimestre = "Quarto";
	else
			trimestre = "Erro!";
	System.out.println("Abril está no " + trimestre + " trimestre.");
}
}