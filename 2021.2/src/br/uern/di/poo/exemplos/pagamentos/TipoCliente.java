package br.uern.di.poo.exemplos.pagamentos;

// Crie uma enum TipoCliente com as constantes STANDARD, GOLD, PLATINUM e BLACK
// com atributos para definir percentuais e limites de cashback para  pagamentos
// e taxa para saque


public enum TipoCliente {
	STANDARD(0.02, 10.0, 15.0),
	GOLD(0.03, 20.0, 10.0),
	PLATINUM(0.04, 35.0, 5.0),
	BLACK(0.05, 50.0, 0.0);
	
	private double percentualCashback;
	private double limiteCashback;
	private double taxaSaque;
	/**
	 * @param percentualCashback
	 * @param limiteCashback
	 * @param taxaSaque
	 */
	private TipoCliente(double percentualCashback, double limiteCashback, double taxaSaque) {
		this.percentualCashback = percentualCashback;
		this.limiteCashback = limiteCashback;
		this.taxaSaque = taxaSaque;
	}
	/**
	 * @return the percentualCashback
	 */
	public double getPercentualCashback() {
		return percentualCashback;
	}
	/**
	 * @return the limiteCashback
	 */
	public double getLimiteCashback() {
		return limiteCashback;
	}
	/**
	 * @return the taxaSaque
	 */
	public double getTaxaSaque() {
		return taxaSaque;
	}	
	
}
