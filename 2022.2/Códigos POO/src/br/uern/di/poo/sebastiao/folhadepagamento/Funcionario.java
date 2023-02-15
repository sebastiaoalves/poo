package br.uern.di.poo.sebastiao.folhadepagamento;

public abstract class Funcionario {
	
	public static final double SALARIO_MINIMO = 1302.0;
	
	private String nome, email, telefone;
	
	public Funcionario(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public double getSalario() {
		return 0.0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
