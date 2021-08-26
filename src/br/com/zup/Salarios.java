package br.com.zup;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, informe o salário");
        double valorSalario = leitor.nextDouble();

        double porcentagem5 = valorSalario * 0.05;
        double porcentagem10 = valorSalario * 0.10;
        double porcentagem15 = valorSalario * 0.15;
        double porcentagem20 = valorSalario * 0.20;

        double valorAumento5 = porcentagem5 + valorSalario;
        double valorAumento10 = porcentagem10 + valorSalario;
        double valorAumento15 = porcentagem15 + valorSalario;
        double valorAumento20 = porcentagem20 + valorSalario;

        if (valorSalario > 0 & valorSalario <= 280){
            System.out.println("O valor do seu salário antigo era de " + valorSalario +" reais");
            System.out.println("A porcentagem de aumento foi de 20%");
            System.out.println("O valor do aumento foi de " + porcentagem20 + " reais");
            System.out.println("Seu novo salário é de " + valorAumento20 + " reais");
        }

        else if (valorSalario > 280 & valorSalario <= 700){
            System.out.println("O valor do seu salário antigo era de " + valorSalario +" reais");
            System.out.println("A porcentagem de aumento foi de 15%");
            System.out.println("O valor do aumento foi de " + porcentagem15 + " reais");
            System.out.println("Seu novo salário é de " + valorAumento15 + " reais");
        }

        else if (valorSalario > 700 & valorSalario <= 1500){
            System.out.println("O valor do seu salário antigo era de " + valorSalario +" reais");
            System.out.println("A porcentagem de aumento foi de 10%");
            System.out.println("O valor do aumento foi de " + porcentagem10 + " reais");
            System.out.println("Seu novo salário é de " + valorAumento10 + " reais");
        }

        else if (valorSalario > 1500){
            System.out.println("O valor do seu salário antigo era de " + valorSalario +" reais");
            System.out.println("A porcentagem de aumento foi de 5%");
            System.out.println("O valor do aumento foi de " + porcentagem5 + " reais");
            System.out.println("Seu novo salário é de " + valorAumento5 + " reais");
        }

        else {
            System.out.println("Por favor, informe um valor válido");
        }

    }
}
