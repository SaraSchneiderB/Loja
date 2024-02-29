
/*
String %s
números flutuantes %f
número inteiro %d
character/letra %c

TELA:

Produtos:
Computador está custando R$2100,00
Mesa de escritório está custando R$650,50

Registro de pessoa: Maria, 30 anos, código 5290 e sexo: F

Medida da Mesa com oito casas decimais: 53,23456700
Medida da Mesa com três casas decimais: 53,235
Medida da Mesa com Ponto decimal dos EUA: 53.235
 */
package com.mycompany.loja;

import java.util.Locale;

public class Loja {

    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        String nomePessoa = "Joana";

        int idade = 30;
        int codigo = 5290;

        char genero = 'F';

        double preco1 = 2100;
        double preco2 = 650.50;
        double medidaDaMesa = 53.234567;

        //System.out.printf("Produtos:\n%s está custando R$ %.2f\n", produto1, preco1);
        //System.out.printf("%s está custando R$ %.2f\n", produto2, preco2);
        //System.out.printf("Registro de pessoa: %s, %d anos, código %d e sexo: %c\n", nomePessoa, idade, codigo, genero);
        //System.out.printf("Medida da mesa com oito casas decimais: %.8f\n", medidaDaMesa);
        //System.out.printf("Medida da mesa com três casas decimais: %.3f\n", medidaDaMesa);
        //Locale.setDefault(Locale.US);
        //System.out.printf("Medida da mesa com Ponto decimal dos EUA: %.3f", medidaDaMesa);
        System.out.printf("Produtos:\n%s está custando R$ %.2f\n"
                + "%s está custando R$ %.2f\n"
                + "Registro de pessoa: %s, %d anos, código %d e sexo: %c\n"
                + "Medida da mesa com oito casas decimais: %.3f\n"
                + "Medida da mesa com três casas decimais: %.3f",
                 produto1, preco1, produto2, preco2, nomePessoa, idade, codigo, genero, medidaDaMesa, medidaDaMesa);

    }
}
