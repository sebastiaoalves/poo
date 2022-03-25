package br.uern.di.poo.exemplos;
import java.util.Random;

public class UERNPay {
	
	private String nomeTitular;
	private double saldo;
	private int numeroConta;
	private TipoCliente tipoCliente;

	/**
	 * @param nomeTitular
	 * @param saldo
	 * @param tipoCliente
	 */
	public UERNPay(String nomeTitular, double saldo, TipoCliente tipoCliente) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.tipoCliente = tipoCliente;
		this.numeroConta = new Random().nextInt();
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
		if(this.saldo >= valorASerSacado + tipoCliente.getTaxaSaque())
			this.saldo -= valorASerSacado+tipoCliente.getTaxaSaque();
	}
	
	public void realizaPagamento(double valorASerPago) {
		if(this.saldo > valorASerPago) {
			this.saldo -= valorASerPago;
			double cashback = valorASerPago * tipoCliente.getPercentualCashback();
			if(cashback > tipoCliente.getLimiteCashback())
				this.saldo += tipoCliente.getLimiteCashback();
			else
				this.saldo += cashback;
		}
	}

	/**
	 * @return the numeroConta
	 */
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
}
