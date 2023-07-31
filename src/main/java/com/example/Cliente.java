package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private boolean especial ;
    
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Cliente(){ //Métodos construtores precisam ser chamados public MetodoConstrutor(), se public void Cliente() ele não é chamado
        System.out.println("Criando um cliente usando o construtor sem parâmetros");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;
        else
            especial = false;
    }

    public Cliente(double renda, char sexo){ //Métodos construtores precisam ser chamados public MetodoConstrutor(), se public void Cliente() ele não é chamado
        this(); //this() deve ser na primeira linha e ele chama o construtor anterior, geralmente menos complexo, para evitar duplicidade de código
        System.out.println("Criando um cliente usando o construtor com parâmetros");
        setRenda(renda);
        this.sexo = sexo;
    }
   
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M'|| sexo == 'F')
            this.sexo = sexo;
        else
            System.out.println("O sexo deve ser M ou F.");
    }

    private int anoNascimento;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda){
        if(renda>=0)
            this.renda = renda; //this relaciona ao objeto atual, no caso cliente e este renda refere-se ao argumento setter e não à classe
        else 
            System.out.println("A renda não pode ser negativa.");
    }
}