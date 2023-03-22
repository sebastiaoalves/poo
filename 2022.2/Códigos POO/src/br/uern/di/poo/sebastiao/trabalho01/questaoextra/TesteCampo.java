package br.uern.di.poo.sebastiao.trabalho01.questaoextra;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class TesteCampo {
	
	public static void main(String[] args) {
		int xSuperiorCampo, ySuperiorCampo, comprimentoX, comprimentoY;
		xSuperiorCampo = parseInt(showInputDialog("Qual o x do início do campo"));
		ySuperiorCampo = parseInt(showInputDialog("Qual o y do início do campo"));
		comprimentoX = parseInt(showInputDialog("Qual o comprimento horizontal do campo"));
		comprimentoY = parseInt(showInputDialog("Qual o comprimento vertical do campo"));
		
		int xCentroBola, yCentroBola, raioBola, velocidadeX, velocidadeY;
		xCentroBola = parseInt(showInputDialog("Qual o x do centro da bola"));
		yCentroBola = parseInt(showInputDialog("Qual o y do centro da bola"));
		velocidadeX = parseInt(showInputDialog("Qual a velocidade horizontal (x) da bola"));
		velocidadeY = parseInt(showInputDialog("Qual a velocidade vertical (y) da bola"));
		raioBola = parseInt(showInputDialog("Qual o raio da bola"));
		
		Bola bola = new Bola(xCentroBola, yCentroBola, velocidadeX, velocidadeY, raioBola);
		CampoRetangular campo = new CampoRetangular(xSuperiorCampo, ySuperiorCampo, 
				comprimentoX, comprimentoY, bola);
		
		showMessageDialog(null, "Início: " + bola);
		for(int i = 0; i < 30; i++) {
			campo.movimentaBola();
			showMessageDialog(null, "Movimento #" + (i+1) + ": " + bola);
		}
		
	}

}
