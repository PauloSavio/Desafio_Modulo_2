package br.com.zup;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Desafio_Modulo_2 {
    public static void main(String[] args) {

        //Instanciando
        Map <String, String> listaDeFuncionarios = new HashMap <>(); //Eu deixei os <> vazios porque o IntelliJ deu um warning e falou que podia deixar vazio
        Scanner leitor = new Scanner(System.in);

        //Pedindo informações
        System.out.println("Bem vindo ao sistema de cadastro de funcionários da PauloCorp");
        System.out.println("Digite o nome completo do funcionário:");
        String nome = leitor.nextLine();
        System.out.println("Digite o telefone do funcionário:");
        String telefone = leitor.nextLine();
        System.out.println("Digite o email do funcionário:");
        String email = leitor.nextLine();
        System.out.println("Digite o CPF do funcionário:");
        String cpf = leitor.nextLine();

        //Adicionando no HashMap
        listaDeFuncionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " Email: " + email);

        //Printando
        System.out.println(listaDeFuncionarios);

    }
}
