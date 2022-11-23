import java.util.Scanner;

public class TesteVariaveis3 {

	public static void main(String[] args) {
		double nota1, nota2, nota3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota do aluno:");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a 2ª nota do aluno:");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a 3ª nota do aluno:");
		nota3 = entrada.nextDouble();
		
		double media = (nota1*4 + nota2*5 + nota3*6) / 15;
		
		System.out.printf("A média é %.1f\n", media);
		
		entrada.close();
	}

}
