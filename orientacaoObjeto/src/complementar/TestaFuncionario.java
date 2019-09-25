package complementar;

import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario");
        String nome = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome);
        int opcao = 0;
        do{
            System.out.println("Digite 1 para alterar nome");
            System.out.println("Digite 2 para alterar salario");
            System.out.println("Digite 3 para imprimir dados");
            System.out.println("Digite 0 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){

                case 1:
                    System.out.println("Digite um novo nome do funcionario");
                    String novoNome = sc.nextLine();
                    funcionario.setNome(novoNome);
                    break;
                case 2:
                    System.out.println("Digite um novo salario do funcionario");
                    double novoSalario = sc.nextDouble();
                    funcionario.setSalario(novoSalario);
                    break;
                case 3:
                    System.out.println(funcionario.toString());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite apenas numero do menu");
            }

        }while (opcao !=0);
    }
}
