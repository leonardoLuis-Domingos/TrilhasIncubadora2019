import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Digite os dados da turma");
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

        System.out.println("Digite os dados do aluno");
        System.out.println("informe o nome do aluno");
        String nomeAluno1 = sc.nextLine();
        System.out.println("informe o rg do aluno");
        Integer rgAluno1 = sc.nextInt();
        System.out.println("informe a data do aluno dd/MM/yyyy");
        Date dataAluno1 = sdf.parse(sc.next());

        Aluno aluno = new Aluno(nomeAluno1,rgAluno1,dataAluno1,new Turma(periodo,serie,sigla,ensino));

        // Aqui entrava com os dados do outro aluno

        /*System.out.println("informe o nome do aluno");
        String nomeAluno2 = sc.nextLine();
        nomeAluno2 = sc.nextLine();
        System.out.println("informe o rg do aluno");
        Integer rgAluno2 = sc.nextInt();
        System.out.println("informe a data do aluno dd/MM/yyyy");
        Date dataAluno2 = sdf.parse(sc.next());
        Aluno aluno2 = new Aluno(nomeAluno2,rgAluno2,dataAluno2);
        */

        System.out.println("Dados da turma");
        System.out.println("Periodo: "+ aluno.getTurma().getPeriodo());
        System.out.println("Serie: "+ aluno.getTurma().getSerie());
        System.out.println("Sigla: "+ aluno.getTurma().getSigla());
        System.out.println("Ensino:"+ aluno.getTurma().getEnsino());
        System.out.println("Dados do Aluno");
        System.out.println(aluno.toString());
        System.out.println("Data" + sdf.format(dataAluno1));


    }
}
