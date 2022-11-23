package br.uern.di.poo.exemplos.folhadepagamento;

public class Main {

	public static void main(String[] args) {
		
		AuxiliarLimpeza auxiliarLimpeza1, auxiliarLimpeza2;
		auxiliarLimpeza1 = new AuxiliarLimpeza("João", "joao@joao.com", "88888");
		auxiliarLimpeza2 = new AuxiliarLimpeza("Josefa", "josefa@josefa.com", "88888");

		Vendedor vendedor1, vendedor2, vendedor3, vendedor4, vendedor5, vendedor6;
		vendedor1 = new Vendedor("José", "jose@jose.com", "999999", 10000.0);
		vendedor2 = new Vendedor("Maria", "maria@maria.com", "999999", 20000.0);
		vendedor3 = new Vendedor("Enzo", "enzo@enzo.com", "999999", 30000.0);
		vendedor4 = new Vendedor("Valentina", "valentina@valentina.com", "999999", 7000.0);
		vendedor5 = new Vendedor("Lisandra", "lisandra@lisandra.com", "999999", 50000.0);
		vendedor6 = new Vendedor("Lucas", "lucas@lucas.com", "999999", 20000.0);
		
		Vendedor vendedoresGerente1[] = {vendedor1, vendedor2, vendedor3};
		Vendedor vendedoresGerente2[] = {vendedor4, vendedor5, vendedor6};
		
		Gerente gerente1, gerente2;
		gerente1 = new Gerente("Max", "max@uern.br", "99999", vendedoresGerente1);
		gerente2 = new Gerente("Alexsandra", "ale@uern.br", "8888", vendedoresGerente2);
		
		Funcionario equipe [] = { auxiliarLimpeza1, auxiliarLimpeza2, vendedor1, vendedor2,
				vendedor3, vendedor4, vendedor5, vendedor5, vendedor6, gerente1, gerente2};
		
		for(Funcionario f : equipe)
			System.out.println(f);
	
	}

}
