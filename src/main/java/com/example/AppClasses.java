package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente(); //A classe Cliente permite criar uma variável composta de vários tipos
        cliente.setRenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(5000, 'F');
        cliente2.setAnoNascimento(1988);
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());
    }
}
