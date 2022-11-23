
public class TesteVariaveis1 {

	public static void main(String[] args) {
		short resposta = 42;
		int patrimonio = 1000000;
		System.out.printf("A resposta para a vida o universo e tudo mais é %d\n", resposta);
		System.out.println("Antes dos " + resposta + " anos eu quero acumular R$"
				+ patrimonio + " em patrimônio");
		resposta =  (short) patrimonio;
		System.out.println(resposta);
	}

}
