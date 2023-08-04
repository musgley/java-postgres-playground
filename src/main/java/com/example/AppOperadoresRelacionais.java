package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente(); //var já declara a variável que o compilador descobre qual é, no caso, Cliente que foi criada anteriormente, explicitada com new Cliente()
        cliente1.setAnoNascimento(1987);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(2000);

        if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
            System.out.println("Os clientes nasceram no mesmo ano.");
            System.out.println("O ano de nascimento dos clientes é " + cliente1.getAnoNascimento() + ".");
        }
        else {
            System.out.println("Os clientes nasceram em anos diferentes.");
            System.out.println("O ano de nascimento do cliente 1 é " + cliente1.getAnoNascimento() + ".");
            System.out.println("O ano de nascimento do cliente 2 é " + cliente2.getAnoNascimento() + ".");
        }

        if (cliente1.getAnoNascimento() > cliente2.getAnoNascimento()) {
            System.out.println("O cliente 1 é mais jovem que o cliente 2.");
        }

        else if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()){
            System.out.println("Os clientes têm a mesma idade.");
        }

        else
            System.out.println("O cliente 2 é mais jovem que o cliente 1.");
            

    }
}
