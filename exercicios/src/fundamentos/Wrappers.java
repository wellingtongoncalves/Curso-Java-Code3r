package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 20000;
		// Integer.parseInt(entrada.next()); // INT // entrada.next
		// pega string e nextLine Inteiros
		Long l = 100000L;

		System.out.println(b.byteValue()); // Valor da vari�vel 100
		System.out.println(s.toString()); // De inteiro 1000 para String "1000"
		System.out.println(i * 3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "... ");

		entrada.close();

	}
}