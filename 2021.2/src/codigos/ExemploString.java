package codigos;
import java.util.Scanner;

public class ExemploString {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		
		String nomeUnderscore = nome.replace(' ', '_');
		
		String nomeMaiusculas = nomeUnderscore.toUpperCase();
		
		System.out.println(nomeMaiusculas.substring(0, 15));
		
		System.out.println(nome.replace(' ', '_').toUpperCase().substring(0, 15));
	}
}
