package exercicioMetodos;
import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario");
        String nome = sc.nextLine();

        System.out.println("Informe o salario do  funcionario");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome,salario);

        System.out.println("Digite um aumento para o funcionario");
        double aumento = sc.nextDouble();

        funcionario.dadosFuncionario();
        System.out.println("Aumento no salario: "+ aumento);
        System.out.println("Salario total: " + funcionario.aumentaSalario(aumento));
    }


}
