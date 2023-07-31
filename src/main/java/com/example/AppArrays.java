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
        matriz[0] = new double[]{1, 2, 3}; //Posso declarar a linha inteira de uma vez, visto que a linha é um vetor
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println();

        //Definindo valores do vetor usando um for
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100*(i+1);
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println();

        double matriznova[][] = new double[3][4];
        //Definindo valores da matriz usando um for
        for (int i = 0; i < matriznova.length; i++) { //matriz.length retorna número de linhas da matriz
            for (int j = 0; j < matriznova[i].length; j++) { //matriz[i].length retorna o número de colunas da linha i
                matriznova[i][j] = 30*(i+j+1);
            }
        }
        System.out.println(Arrays.toString(matriznova[0]));
        System.out.println(Arrays.toString(matriznova[1]));
        System.out.println(Arrays.toString(matriznova[2]));
        System.out.println();

        for (int i = 0; i < matriznova.length; i++) {
            for (int j = 0; j < matriznova[i].length; j++) {
                System.out.printf("%5.1f ", matriznova[i][j]); //printf imprime o inteiro, sem espaço ao final da linha. O %5.1f representa o float com 5 caracteres e 1 casa decimal
            }
            System.out.println();
        } //Impressão em formato de matriz e alinhado
    }
}
