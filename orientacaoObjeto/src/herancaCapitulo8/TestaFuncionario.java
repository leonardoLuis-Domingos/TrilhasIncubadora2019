package herancaCapitulo8;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Informe os dados do funcionario");
        System.out.println("Digite o nome do funcionario");
        String nome = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        double salario = sc.nextDouble();
        System.out.println("Digite a bonificação do funcionario");
        double bonificacao = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome,salario,bonificacao);
        System.out.println("Mostra dados funcionario");
        funcionario.motraDados();
        System.out.println("---------------------------------------------");
        sc.nextLine();
        System.out.println("Informe os dados do gerente");
        System.out.println("Digite o nome do gerente");
        String nomeGerente = sc.nextLine();
        System.out.println("Digite o salario do gerente");
        double salarioGerente = sc.nextDouble();
        System.out.println("Digite a bonificação do gerente");
        double bonificacaoGerente = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o premio do gerente");
        int premio = sc.nextInt();
        Gerente gerente = new Gerente(nomeGerente,salarioGerente,bonificacaoGerente,premio);
        System.out.println("Mostra dados do gerente");
        gerente.motraDados();
        sc.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Informe os dados da secretaria");
        System.out.println("Digite o nome da secretaria");
        String nomeScretaria = sc.nextLine();
        System.out.println("Digite o salario da secretaria");
        double salarioSecretaria = sc.nextDouble();
        System.out.println("Digite a bonificação da secretaria");
        double bonificacaoSecretaria = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o numero de ristro da secretaria");
        int numero = sc.nextInt();

        Secretaria secretaria = new Secretaria(nomeScretaria,salarioSecretaria,bonificacaoSecretaria,numero);
        System.out.println("Mostra dados da secretaria");
        secretaria.motraDados();
        sc.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Informe os dados da Telefonista");
        System.out.println("Digite o nome da telefonista");
        String nomeTelefonista = sc.nextLine();
        System.out.println("Digite o salario da telefonista");
        double salarioTelefonista = sc.nextDouble();
        System.out.println("Digite a bonificação da telefonista");
        double bonificacaoTelefonista = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o numero de ristro da telefonista");
        String registro = sc.nextLine();

        Telefonista telefonista = new Telefonista(nomeTelefonista,salarioTelefonista,bonificacaoTelefonista,registro);
        telefonista.motraDados();
    }
}
