package br.uern.di.poo.sebastiao.folhadepagamento;

public class TesteFuncionario {
	
	public static void main(String args[]) {
		Funcionario funcionario1 = 
				new Funcionario("João", "joao@joao.com", "8488888888");
		funcionario1.setSalario(1000);
		System.out.println("O salário de " + funcionario1.getNome() +
				" é de R$ " + funcionario1.getSalario());
		
	}

}
