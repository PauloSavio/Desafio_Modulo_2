package br.com.zup;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Desafio_Modulo_2 {
    public static void main(String[] args) {

        Map <String, String> listaDeFuncionarios = new HashMap <>(); //Eu deixei os <> vazios porque o IntelliJ deu um warning e falou que podia deixar vazio
        Scanner leitor = new Scanner(System.in);
        boolean chave = true;
        System.out.println("Bem vindo ao sistema de cadastro de funcionários da PauloCorp");

        int opcao = 0;
        while (chave == true){
            //Menu
            System.out.println("Digite 1 para cadastrar um funcionário");
            System.out.println("Digite 2 para sair");
            opcao = leitor.nextInt();
            leitor.nextLine(); //Assim o leitor lê o enter mas não armazena, aí não dá erro na mudança de int pra String

            if (opcao == 1){
                //Cadastrar
                //Pedindo informações
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
            }
            else if (opcao == 2){
                //Sair
                chave = false;
            }
            else{
                System.out.println("Por favor, informe uma opção válida");
            }
        }

    }
}
