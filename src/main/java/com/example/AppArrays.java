package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        double vetor[] = {10, 20, 30};
        //System.out.println(vetor) não imprime o vetor
        System.out.println(Arrays.toString(vetor));
        System.out.println("Valor da posição 0: " + vetor[0]);
        System.out.println("Valor da posição 1: " + vetor[1]);
        System.out.println("Valor da posição 2: " + vetor[2]);

        double vetorgrande[] = new double[50]; //vetorgrande foi inicializado como um vetor de 50 espaços double

        double matriz[][] = { {10, 20, 30}, {40, 50, 60}}; //Matriz com 3 colunas e 2 linhas
        matriz[0][1] = -20; //Trocando o valor da linha 0 e coluna 1
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1])); //Usar somente Arrays.toString(matriz) não imprime por estaria tentando imprimir o vetor
        matriz[0] = new double[]{1.0, 2.0, 3.0}; //Posso declarar a linha inteira de uma vez, visto que a linha é um vetor. Lembrando tb que se for double preciso 1.0 e não 1
        System.out.println(Arrays.toString(matriz[0]));
    }
}
