package br.uern.di.poo.exemplos.pagamentos;

public class ContaProva {
	
	private String nomeTitular;
	private double saldo;
	
	public static double SALDO_INICIAL = 0;
	
	public ContaProva (double saldo) {
		this.saldo = saldo;
		this.nomeTitular = "";
	}
	
	public ContaProva (double saldo, String nomeTitular) {
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;	
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
	
	
}
