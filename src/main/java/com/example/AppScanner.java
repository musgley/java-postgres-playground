package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente(); //A classe Cliente permite criar uma variável composta de vários tipos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: "); 
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o CPF: "); 
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a cidade: "); 
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a renda: "); 
        cliente.setRenda(scanner.nextDouble());

        System.out.println("Digite o ano de nascimento: "); 
        cliente.setAnoNascimento(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o sexo: "); 
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Especial: " + cliente.isEspecial());

        
    }
}
