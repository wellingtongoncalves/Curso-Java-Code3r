package fundamentos;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		String [] palavraListaUm = {"PRESBITERIANA","BATISTA","METODISTA","ASSEMBLÉIA","LUTERANA"};

	
	String [] palavraListaDois = {"PRESBITERIANA","BATISTA","METODISTA","ASSEMBLÉIA","LUTERANA"};

String [] palavraListaTres = {"PRESBITERIANA","BATISTA","METODISTA","ASSEMBLÉIA","LUTERANA"};

int UmLength = palavraListaUm.length;
int DoisLength = palavraListaDois.length;
int TresLength = palavraListaTres.length;

int rand1 = (int) (Math.random() * UmLength);
int rand2= (int) (Math.random() * DoisLength);
int rand3=(int) (Math.random() *TresLength);

String frase = palavraListaUm[rand1] + " " + palavraListaDois[rand2] + " " + palavraListaTres[rand3];


		System.out.println("Precisamos de igrejas "  + frase);
	}
	
}
