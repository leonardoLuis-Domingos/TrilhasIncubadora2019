package encapsulamento;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("digite o nome do titular da conta");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo da conta");
        double saldo = sc.nextDouble();

        Banco banco = new Banco(numero,nome,saldo);
        System.out.println(banco.toString());

        System.out.println("Atualizar os dados");

        System.out.println("Digite um novo numero");
        int numeroNovo = sc.nextInt();
        banco.setNumeroConta(numeroNovo);
        sc.nextLine();
        System.out.println("digite o nome do titular da conta");
        String nomeNovo = sc.nextLine();
        banco.setNome(nomeNovo);
        System.out.println("Digite o saldo da conta");
        double saldoNovo = sc.nextDouble();
        banco.setSaldo(saldoNovo);

        System.out.println(banco.toString());


    }
}
