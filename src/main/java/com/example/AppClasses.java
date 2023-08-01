package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente(); //A classe Cliente permite criar uma variável composta de vários tipos
        cliente.setRenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        cliente.setNome("           Manoel");
        cliente.setCpf("99999999999");
        cliente.setCidade("Palmas");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(5000, 'F');
        cliente2.setAnoNascimento(1988);
        cliente2.setNome("Joana");
        cliente2.setCpf("99999999999");
        cliente2.setCidade("PALMAS");

        if(cliente.getCpf().equals(cliente2.getCpf()))
            System.out.println("Cliente 1 e Cliente 2 possuem o mesmo CPF.");
        else {
            System.out.println("Os clientes possuem CPF diferentes.");
        }
        if(cliente.getCidade().equalsIgnoreCase(cliente2.getCidade())) //equalsIgnoreCase testa igualdade de strings ignorando se maiúsculas ou minúsculas
            System.out.println("Cliente 1 e Cliente 2 moram na mesma cidade.");
        else {
            System.out.println("Os clientes moram em cidades diferentes.");
        }
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());
    }
}
