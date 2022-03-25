package br.uern.di.poo.testeexemplos;
import java.util.Arrays;

public class TesteArray {

	public static void main(String[] args) {
		int diasDeAulaFevereiro [] = {9, 18, 11, 2, 30, 16, 4};
		int diasDeAulaMarco [];
		diasDeAulaMarco = new int [diasDeAulaFevereiro.length];
		
		System.arraycopy(diasDeAulaFevereiro, 0, diasDeAulaMarco, 0, diasDeAulaMarco.length-1);
		for (int i = 0; i < diasDeAulaFevereiro.length; i++)
			System.out.print(diasDeAulaMarco[i] + " ");
		
		System.out.println("");
		
		if(Arrays.equals(diasDeAulaFevereiro, diasDeAulaMarco))
			System.out.println("Dias de aula de fevereiro e março são iguais.");
		else
			System.out.println("Dias de aula de fevereiro e março são diferentes.");
		
		Arrays.sort(diasDeAulaFevereiro);
		
		for(int dia:diasDeAulaFevereiro)
			System.out.print(dia + " ");
		System.out.println("");
		
		int diaProcurado = 18;
		
		if(Arrays.binarySearch(diasDeAulaFevereiro, diaProcurado)>=0)
			System.out.println("No dia " + diaProcurado + " tem aula.");
		else
			System.out.println("No dia " + diaProcurado + " não tem aula.");
		
		
		Arrays.fill(diasDeAulaMarco, -1);
		
		for(int dia:diasDeAulaMarco)
			System.out.print(dia + " ");
		System.out.println("");
	}
	
}
