package br.uern.di.poo.sebastiao.uernpay;

public class ContaV4 {

	// Atributos da classe com encapsulamento privado
	private int numero;
	private String nomeDoTitular;
	private double saldo;
	
	private static int numeroProximaConta = 1;
	
	public static final double TAXA_DE_SAQUE = 12.50; 
	
	// Construtrores públicos 
	public ContaV4 (){
		this("Sem titular", 0.0);
	}
	
	public ContaV4 (String nomeDoTitular){
		this(nomeDoTitular, 0.0);
	}
	
	public ContaV4 (String nomeDoTitular, double saldo){
		this.numero = numeroProximaConta;
		numeroProximaConta++;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	// Operação da classe pública
	public void exibeConta() {
		System.out.println("Minha conta: ");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Nome do titular: " + this.nomeDoTitular);
		System.out.printf("Saldo da conta: %.2f\n\n", this.saldo);
	}
	
	public void deposita(double valor) {
		if(valor > 0.0)
			this.saldo += valor;
		else
			System.out.println("ERRO: Valor a ser depositado deve ser maior que zero");
	}
	
	public void saca(double valor) {
		if(valor <= 0.0) 
			System.out.println("Erro: o valor do saque deve ser maior que zero");
		else if(valor+TAXA_DE_SAQUE > this.saldo)
			System.out.println("Erro: saldo insuficiente para saque(e taxa)");
		else
			this.saldo -= valor+TAXA_DE_SAQUE;
	}
	
	// Métodos gets/sets gerados automaticamente pelo eclipse
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the nomeDoTitular
	 */
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	/**
	 * @param nomeDoTitular the nomeDoTitular to set
	 */
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
			
}
