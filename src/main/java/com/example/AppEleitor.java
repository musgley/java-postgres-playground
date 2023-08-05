package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1945,12,8)); //LocalDate.of(yyyy,mm,dd)
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());
    }
}
