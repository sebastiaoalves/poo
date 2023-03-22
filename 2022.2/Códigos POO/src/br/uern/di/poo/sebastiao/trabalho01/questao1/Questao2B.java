/* As datas são impressas em vários formatos comuns. Dois dos formatos mais comuns em inglês são
 *  04/25/1955 e April 25, 1955
 *  Elabore um aplicativo que lê uma data no primeiro formato e imprime no segundo formato.
 */

package br.uern.di.poo.sebastiao.trabalho01.questao1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Questao2B {

	
	private static final String nomesDosMeses [] = {"January", "February", "March", "April", "May", 
			"June", "July", "August", "September", "October", "November", "December"};
	
	private static int diasDosMeses [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void exibeErro(String erro) {
		System.err.println("Data com formato inválido: " + erro);
		System.exit(0);
	}
	
	public static boolean verificaAnoBissexto(int ano) {
		if(ano%4==0 && (ano%100!=0 || ano%400==0))
			return true;
		return false;
	}
	
	public static boolean verificaData(int dia, int mes, int ano) {
		if (mes<1 || mes>12)
			exibeErro("Mês inválido.");
		
		int diaMax = diasDosMeses[mes-1];
		if(mes == 2 && verificaAnoBissexto(ano))
			diaMax++;
		
		if(dia<1 || dia > diaMax)
			exibeErro("Dia inválido.");
		
		return true;
	}
		
	public static void main(String[] args) {
		
		String dataNoFormato1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a data no formato: MM/DD/AAAA");
		dataNoFormato1 = s.next();
		s.close();
				
		// Verifica se tem dia mês e ano
		if (!Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dataNoFormato1)) 
			exibeErro("Não foram informados os três valores como descrito.");

		String tokensData [] = dataNoFormato1.split("/");
		int dia = Integer.parseInt(tokensData[1]);
		int mes = Integer.parseInt(tokensData[0]);
		int ano = Integer.parseInt(tokensData[2]);
		
		if(verificaData(dia, mes, ano)) {
			StringBuilder dataNoFormato2 = new StringBuilder();
			dataNoFormato2.append(nomesDosMeses[mes-1]);
			dataNoFormato2.append(' ');
			if(dia<10) dataNoFormato2.append('0');
			dataNoFormato2.append(dia);
			dataNoFormato2.append(", ");
			dataNoFormato2.append(ano);
			System.out.println("Data formatada: " + dataNoFormato2);
		}
	}

}
