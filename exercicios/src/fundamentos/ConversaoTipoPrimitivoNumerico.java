package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // expl�cita (CAST) , houve perda de inf 1.1234568
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e  = 1.9999999;
		int f  = (int) e; // expl�cita (CAST)
		System.out.println(f);
		

	}

}
