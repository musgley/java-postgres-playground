package com.example;

public class AulaDeclaracao {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("Minha aplicação Java\n");
        // tipo NomeDaVariavel = valor;
        int idade = 10;
        double peso = 80.5;
        System.out.println("Idade é " + idade + " e peso é " + peso);

        char sexo = 'M';
        System.out.println("Sexo é " + sexo);

        // Em Java 1 e 0 não é aceito como true ou false, JavaScript já aceita
        boolean NecessidadesEspeciais = false;
        System.out.println("Possui necessidades especiais: " + NecessidadesEspeciais);

        //Usar var NomeDaVariavel funciona a partir do Java 10, pois o compilador detecta o tipo de variável automaticamente
    }
}
