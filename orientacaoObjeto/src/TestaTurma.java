import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaTurma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Periodo");
            String periodo = sc.nextLine();
            System.out.println("Digite a serie que esta atualmente");
            String serie = sc.nextLine();
            System.out.println("Digite a sigla");
            char sigla = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite ensino");
            String ensino = sc.nextLine();

            Turma turma = new Turma(periodo,serie,sigla,ensino );

            System.out.println("------------------------------");
            System.out.println("Digite o Periodo");
            String periodo2 = sc.nextLine();
            System.out.println("Digite a serie que esta atualmente");
            String serie2 = sc.nextLine();
            System.out.println("Digite a sigla");
            char sigla2 = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o ensino");
            String ensino2 = sc.nextLine();

            Turma turma2 = new Turma(periodo2,serie2,sigla2,ensino2);
            System.out.println(turma.toString());
            System.out.println(turma2.toString());

    }
}
