package com.example;

public class AppOpLógicos {
    boolean a(boolean valor){
        System.out.println("a");
        return valor;
    }

    boolean b(boolean valor){
        System.out.println("b");
        return valor;
    }

    boolean c(boolean valor){
        System.out.println("c");
        return valor;
    }

    AppOpLógicos(){
        System.out.println(a(true)||b(false)&&c(false)); //A expressão é resolvida da esquerda pra direita e tem short circuit, logo de o primeiro do "ou" é true, a expressão encerra
    }
    public static void main(String[] args) {
        new AppOpLógicos();
    }
}
