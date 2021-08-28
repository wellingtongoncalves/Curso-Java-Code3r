
package com.mycompany.GereEscola;


import com.mycompany.Matematica.Nota;


public class Desempenho extends Nota {
	
	private float media , CR;
	private Nota nota;

	
	public Desempenho () {
		nota = new Nota ();
		media = calcularMedia();
		CR = calcularCoeficienteRendimento();
		
	}
}