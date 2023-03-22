package br.uern.di.poo.sebastiao.trabalho01.questaoextra;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Random;

public class TesteCampo2 {

	public static void main(String[] args) {
		int comprimentoX, comprimentoY;
		comprimentoX = parseInt(showInputDialog("Qual o comprimento horizontal do campo"));
		comprimentoY = parseInt(showInputDialog("Qual o comprimento vertical do campo"));

		Random random = new Random();
		
		int raioBola, velocidadeX, velocidadeY;
		velocidadeX = (int) (comprimentoX * (0.05 + random.nextDouble()*0.05));
		velocidadeY = (int) (comprimentoY * (0.05 + random.nextDouble()*0.05));
		raioBola = parseInt(showInputDialog("Qual o raio da bola"));
		
		Bola bola = new Bola(comprimentoX/2, comprimentoY/2, velocidadeX, velocidadeY, raioBola);
		CampoRetangular campo = new CampoRetangular(0, 0, comprimentoX, comprimentoY, bola);
		
		showMessageDialog(null, "Início: " + bola);
		for(int i = 0; i < 30; i++) {
			campo.movimentaBola();
			showMessageDialog(null, "Movimento #" + (i+1) + ": " + bola);
		}
		
	}
	
}
