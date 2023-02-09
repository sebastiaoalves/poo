package br.uern.di.poo.sebastiao.uernpay;

public class ContaV3 {

	// Atributos da classe com encapsulamento privado
	private int numero;
	private String nomeDoTitular;
	private double saldo;
	
	// Construtrores públicos 
	public ContaV3 (){
		this(-1, "Sem titular", 0.0);
	}
	
	public ContaV3 (int numero, String nomeDoTitular){
		this(numero, nomeDoTitular, 0.0);
	}
	
	public ContaV3 (int numero, String nomeDoTitular, double saldo){
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}
	
	// Operação da classe pública
	void exibeConta() {
		System.out.println("Minha conta: ");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Nome do titular: " + this.nomeDoTitular);
		System.out.printf("Saldo da conta: %.2f\n\n", this.saldo);
	}
	
	// Métodos gets/sets gerados automaticamente pelo eclipse
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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
