package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>(); //Cria-se uma lista, que é um vetor, da classe Cliente de tamanho 10 como padrão
        //List<Cliente> listaClientes = new LinkedList<>();       LinkedList<>() cria um espaço de memória por vez ao contrário de ArrayList<>()
        var cliente1 = new Cliente();
        cliente1.setNome("João Paulo");
        cliente1.setCidade("Goiânia");

        var cliente2 = new Cliente();
        cliente2.setNome("Manoel");
        cliente2.setCidade("Palmas");

        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2); //Até dez espaços o ArrayList cobre

        listaClientes.add(cliente2); //Quando pede um espaço a mais, o ArrayList cria um novo vetor 50% maior e copia o vetor antigo, criando um novo

        listaClientes.remove(0); //Remove da lista o cliente da posição 0
        listaClientes.remove(cliente2); //Remove da lista a PRIMEIRA ocorrência do cliente2
        int i = listaClientes.size() - 1; //size() retorna o tamanho da lista
        listaClientes.remove(i); //Remove a lista o último cliente

        for (Cliente cliente : listaClientes) { //Esse é um foreach que passa em todos os espaços da lista
            System.out.println(cliente);
        }
    }
}
