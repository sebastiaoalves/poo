package br.uern.di.poo.sebastiao.trabalho01.questao2;

public class Evento {
	
	private String nome, time1, time2;
	private double oddVitoriaTime1, oddEmpate, oddVitoriaTime2;
	private Resultado resultado;
	public Evento(String nome, String time1, String time2, double oddVitoriaTime1, double oddEmpate,
			double oddVitoriaTime2) {
		this.nome = nome;
		this.time1 = time1;
		this.time2 = time2;
		this.oddVitoriaTime1 = oddVitoriaTime1;
		this.oddEmpate = oddEmpate;
		this.oddVitoriaTime2 = oddVitoriaTime2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public double getOddVitoriaTime1() {
		return oddVitoriaTime1;
	}
	public void setOddVitoriaTime1(double oddVitoriaTime1) {
		this.oddVitoriaTime1 = oddVitoriaTime1;
	}
	public double getOddEmpate() {
		return oddEmpate;
	}
	public void setOddEmpate(double oddEmpate) {
		this.oddEmpate = oddEmpate;
	}
	public double getOddVitoriaTime2() {
		return oddVitoriaTime2;
	}
	public void setOddVitoriaTime2(double oddVitoriaTime2) {
		this.oddVitoriaTime2 = oddVitoriaTime2;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

}
