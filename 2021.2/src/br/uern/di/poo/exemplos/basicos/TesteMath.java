package br.uern.di.poo.exemplos.basicos;

public class TesteMath {

	public static void main(String[] args) {
		double a = 1, b = -5, c = 4;
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("O valor de x1 é " + x1 + "\nO valor de x2 é " + x2);
		
		System.out.println("O seno de PI é " + Math.sin(Math.PI/2));
	}
	
}
