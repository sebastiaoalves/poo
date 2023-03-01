package br.uern.di.poo.sebastiao.folhadepagamento;

public interface Pagavel extends Comparable {

	public double getSalario();

	@Override
	default int compareTo(Object o) {
		double salario1 = getSalario();
		Pagavel p = (Pagavel) o;
		double salario2 = p.getSalario();
		if(salario1 < salario2)
			return -1;
		else if(salario1 == salario2)
			return 0;
		else
			return 1;
	}
	
}
