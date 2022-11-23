package br.uern.di.poo.exemplos.basicos;

import java.util.Scanner;
import javax.swing.*;

public class Variaveis {
	
	public static void defineJanela1(JFrame janela1) {
		janela1.setVisible(true);
		janela1.setSize(100, 100);
		janela1.setLocation(300, 300);
		janela1.setTitle("Uma Janela");
		janela1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public static void main(String []args){
		Scanner entrada = new Scanner(System.in);
		int número1 = entrada.nextInt(), número2 = 10;
		double numeroReal = entrada.nextDouble();
		System.out.println(número2 + numeroReal);
		var ch = 'a';
		número2 = número1 + 5;
		boolean ok = true;
		char endl = '\n', tab = '\t';
		String programação = "スケジュール ";
		
		System.out.println("ch: " + ch + tab + endl + programação + ok);
		
		String nome = entrada.next();
		System.out.println("O nome lido foi: " + nome);
		// Scanner leituraArquivo = new Scanner (new File("entrada.txt"));
		JFrame janela1 = new JFrame();
		defineJanela1(janela1);
		JFrame janela2 = new JFrame("Minha janela");
			janela2.setVisible(true);
			janela2.setSize(200, 200);
			janela2.setExtendedState(JFrame.MAXIMIZED_BOTH);
			janela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		entrada.close();
	}

}
