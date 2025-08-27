package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Maria";
        pessoa.idade = 17;
        // pessoa.salario = 1.000; atributos privado não são visíveis

        // Instanciando classes que estão declaradas em outros arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Maria";
        pessoa1.idade = 17;
        pessoa1.altura = 1.59;

        pessoa2.nome = "Luiz";
        pessoa2.idade = 19;
        pessoa2.altura = 1.70;

        pessoa1.exibirDados();

        pessoa2.exibirDados();

        pessoa1.atribuirSalario(2000.0, 500 );
        pessoa2.atribuirSalario(3500);
    }

}
