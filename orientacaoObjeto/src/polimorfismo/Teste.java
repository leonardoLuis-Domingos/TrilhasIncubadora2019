package polimorfismo;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do Gerente");
        System.out.println("Digite o codigo do gerente");
        int codigoGerente = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do gerente");
        String nomeGerente = sc.nextLine();
        System.out.println("Digite o usuario do gerente");
        String usuario = sc.nextLine();
        System.out.println("Digite a senha do gerente");
        String senha = sc.nextLine();

        Funcionario gerente = new Gerente(codigoGerente,nomeGerente,usuario,senha);
        ControleDePonto controleDePonto = new ControleDePonto();
        controleDePonto.registraEntrada(gerente);
        controleDePonto.registraSaida(gerente);
        System.out.println("--------------------------------");
        System.out.println("Digite os dados da telefonista");
        System.out.println("Digite o codigo do telefonista");
        int codigoTelefonista = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do telefonista");
        String nomeTelefonista = sc.nextLine();
        System.out.println("Digite o ramal da telefonista");
        int ramal = sc.nextInt();
        Funcionario telefonista = new Telefonista(codigoTelefonista,nomeTelefonista,ramal);
        controleDePonto.registraEntrada(telefonista);
        controleDePonto.registraSaida(telefonista);



    }
}
