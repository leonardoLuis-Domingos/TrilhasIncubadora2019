package complementar;

import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        int numero = sc.nextInt();
        System.out.println("Digite o limite");
        double limite = sc.nextDouble();
        System.out.println("Digite o saldo");
        double saldo = sc.nextDouble();
        ContaDoBanco conta = new ContaDoBanco(numero,limite,saldo);

        int menu =0;
        System.out.println("Menu de opereções");
        do{
            System.out.println("Digite 1 para depositar");
            System.out.println("Digite 2 para sacar");
            System.out.println("Digite 3 para imprimir dados da conta");
            System.out.println("Digite 0 para sair");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Digite o valor do deposito");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.println(conta.toString());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Informe apenas numeros do menu ");
            }
        }while(menu != 0);
    }
}
