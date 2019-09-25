import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cargo do funcionario");
        String cargo1 = sc.nextLine();

        System.out.println("Digite o salario do funcionario");
        Double salario1 = sc.nextDouble();

        Funcionario funcionario1 = new Funcionario(cargo1,salario1);
        sc.nextLine();
        System.out.println("Digite o cargo do funcionario");
        String cargo2 = sc.nextLine();

        System.out.println("Digite o salario do funcionario");
        Double salario2 = sc.nextDouble();

        Funcionario funcionario2 = new Funcionario(cargo2,salario2);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
    }
}
