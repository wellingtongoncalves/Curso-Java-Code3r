package fundamentos;

public class ComparacaoString {

	public static void main(String[] args) {
		
		/*
		 String nome1 = "Wellington";
		String nome2 = "Wellington";
		String nome3 = new String("Wellington");
		String res;
		res = (nome1 == nome3)? "ID�NTICO":"N�O ID�NTICO";
		System.out.println(res);
		*/
		
		String nome1 = "Wellington";
		String nome2 = "Wellington";
		String nome3 = new String("Wellington");
		String res;
		res = (nome1.equals(nome3) )? "ID�NTICO":"N�O ID�NTICO";
		System.out.println(res);

	}

}
