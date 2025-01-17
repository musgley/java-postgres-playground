package com.example;

public class Cliente {
    private String cpf;
    private String nome;
    private String cidade;
    private double renda;
    private char sexo;
    private boolean especial;
    private int anoNascimento;
    
    public Cliente(){ //Métodos construtores precisam ser chamados public MetodoConstrutor(), se public void Cliente() ele não é chamado
        //System.out.println("Criando um cliente usando o construtor sem parâmetros");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;
        else
            especial = false;
    }
    public Cliente(double renda, char sexo){ //Métodos construtores precisam ser chamados public MetodoConstrutor(), se public void Cliente() ele não é chamado
        this(); //this() deve ser na primeira linha e ele chama o construtor anterior, geralmente menos complexo, para evitar duplicidade de código
        //System.out.println("Criando um cliente usando o construtor com parâmetros");
        setRenda(renda);
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.isBlank())
            System.out.println("Nome é obrigatório.");
        else
        this.nome = nome.toUpperCase().trim();
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo == 'M'|| sexo == 'F'|| sexo == 'm'|| sexo == 'f')
            this.sexo = sexo;
        else
            System.out.println("O sexo deve ser M, m, F ou f.");
    }
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

    public String toString(){
        return "Cliente: " + nome + " Cidade: " + cidade;
    }
}