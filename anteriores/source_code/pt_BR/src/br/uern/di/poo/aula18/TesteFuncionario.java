package br.uern.di.poo.aula18;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Sebastião");
        System.out.println(f.getSalario());
        Assalariado a = new Assalariado("Sebastião", 40, 10000);
        System.out.println(a.getSalario());
        Comissionado c = new Comissionado("Sebastiao", 40, 10000, 3000);
        System.out.println(c.getSalario());
        
        Funcionario []folha = {f, a, c};
        double total = 0;
        for(Funcionario tmp:folha)
            total+=tmp.getSalario();
        
    }
}
