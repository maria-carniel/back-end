package com.mycompany.poo.aula11;

public class Pessoa {
    /**
     * Encapsulamento (Métodos Acessores/Modificadores)
     * 
     * Em projetos em grande escala, para mantermos a segurança de nossas classes,
     * Utilizamos o modificador de acesso privado, com uma maior frequência.
     * 
     * Em muitas situações precisamos buscar e alterar uma ou mais informações,
     * e é nesse cenário que utilizamos os métodos:
     * - Getter: Acessar/Buscar
     * - Setter: Modificador/Alterar
     */
    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Declaramos sempre após a declaração dos atributos

    // Métodos acessor, sempre começa com get
    public String getNome() {
        return nome;
    }

    // Métodos modificador, sempre com set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Change the value
        pessoa.setNome("Leonardo");
        pessoa.setIdade(26);

        // Access the value
        System.out.printf("O %s tem %d anos de idade\n",
                pessoa.getNome(), pessoa.getIdade());
}
