package br.uern.di.poo.sebastiao.trabalho01.questao2;

public class Aposta {

	private Evento evento;
	private Resultado resultado;
	private double valorApostado;
	public Aposta(Evento evento, Resultado resultado, double valorApostado) {
		this.evento = evento;
		this.resultado = resultado;
		this.valorApostado = valorApostado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public double getValorApostado() {
		return valorApostado;
	}
	public void setValorApostado(double valorApostado) {
		this.valorApostado = valorApostado;
	}
	public double calculaLucro(Evento evento) {
		double valorAReceber = 0.0;
		if(this.resultado ==  evento.getResultado())
			if(this.resultado == Resultado.TIME1)
				valorAReceber = valorApostado * evento.getOddVitoriaTime1();
			else if(this.resultado == Resultado.EMPATE)
				valorAReceber = valorApostado * evento.getOddEmpate();
			else
				valorAReceber = valorApostado * evento.getOddVitoriaTime2();
		return valorAReceber;
	}
	
	
}
