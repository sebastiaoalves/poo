package br.uern.di.poo.exemplos.folhadepagamento;

public abstract class Funcionario {
	
	private String nome;
	private String email;
	private String telefone;
	
	public static final double SALARIO_MINIMO = 1212.0;
	
	public Funcionario() {
		this.nome = "Não informado";
		this.email = "E-mail desconhecido";
		this.telefone = "Telefone não fornecido";
	}

	public Funcionario(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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
	
	public abstract double getSalario();
	
	@Override
	public String toString() {
		return "\t\tNome: " + this.nome + "\t\tSalário: " + getSalario();
	}
}
