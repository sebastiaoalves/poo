package br.uern.di.poo.exemplos;

public class UERNPay2 {
	
	private static int numeroProximaConta = 1;
	
	private final static double TAXA_DE_SAQUE = 9.99;
	
	private String nomeTitular;
	private double saldo;
	private int numeroConta;

	/**
	 * @param nomeTitular
	 * @param saldo
	 */
	public UERNPay2(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.numeroConta = numeroProximaConta;
		numeroProximaConta++;
	}

	/**
	 * @return the nomeTitular
	 */
	public String getNomeTitular() {
		return nomeTitular;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	public void realizaDeposito (double valorASerDepositado) {
		this.saldo += valorASerDepositado;
	}
	
	public void realizaSaque (double valorASerSacado) {
		if(this.saldo >= valorASerSacado + TAXA_DE_SAQUE)
			this.saldo -= valorASerSacado+TAXA_DE_SAQUE;
	}

	/**
	 * @return the numeroProximaConta
	 */
	public static int getNumeroProximaConta() {
		return numeroProximaConta;
	}

	/**
	 * @return the numeroConta
	 */
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
}
