package br.com.erickfreire.foraprimorada;

/**
 * Programa em Java que calcula o valor de um vetor de double com o for aprimorado.
 * @author Erick Freire
 * @version 1 - Criado em 12-06-2021 as 14:16
 */

public class UsandoAInstrucaoForAprimorada {

	public static void main(String[] args) {
		
		double[] vetor = {2.0, 3.5, 4.5, 6.5, 8.5};
		
		double resultado = 0.0;
		
		for(double d : vetor)
			resultado += d;
		
		System.out.printf("O resultado da soma é de : %.2f", resultado);

	}

}
