package br.uern.di.poo.exemplos;

public class Conta {
	
	public String nomeTitular;
	
	private double saldo;
	
	public Conta ( ) {
		this ("Não especificado", 0.0);
	}
	
	public Conta (String nomeTitular) {
		this (nomeTitular, 100.0);
	}

	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

	/** 
	    * Construtor que inicializa o objeto com o nome do titular e o saldo inicial. 
	    * @param nomeTitular O nome do titular da conta.
	    * @param saldo O saldo inicial da conta.
	    */
	public Conta(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	/**
	 * @return the nomeTitular
	 */
	public String getNomeTitular() {
		return nomeTitular;
	}

	/** 
	    * Deposita um valor na conta, retornando o novo saldo.
	    * @param valorASerDepositado O valor a ser depositado
	    */
	public void realizaDeposito (double valorASerDepositado) {
		this.saldo += valorASerDepositado;
	}
	
	public void realizaSaque (double valorASerSacado) {
		this.saldo -= valorASerSacado;
	}
	
	public double consultaSaldo() {
		return this.saldo;
	}
	
}
