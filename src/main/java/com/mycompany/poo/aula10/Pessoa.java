package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de Acesso
     * 
     * quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança para nossas classes,
     * 
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Interfaces
     * -Atributos
     * -Métodos
     */
    public String nome; // Público, é visivel em qualquer classe.
    protected int idade; // Potegido, é visivel somente em classes filhas (Herança).
    private double salario; // Privado, é visivel somente dentro da própria classe.
    double altura; // Friendly ou Público, apesar de não estar explicitado, ele também é visivel.

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade; " + idade);
        System.out.println("Altura (m): " + altura);
    }

    /**
     * Nomenclatura de métodos
     * 
     * Métodos/Funções indicam ações, e por padrão utilizamos verbos.
     * 
     * Ex.: correr, andar, caminhar ...
     */
    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salário de " + this.nome + " é; " + this.salario);
    }

    public void atribuirSalario(double valor, double bonus) {
        this.salario = valor + bonus;

        System.out.println("O novo salário de " + this.nome + " é: " + this.salario + " mais um bônus de " + bonus);
    }
}
