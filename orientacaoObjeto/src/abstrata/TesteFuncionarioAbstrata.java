package abstrata;

import java.util.Scanner;

public class TesteFuncionarioAbstrata {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Funcionario funcionario = new Funcionario("leo",54);// instancia do funcionario ex2
//        funcionario.setNome("leandro");// alterando os dados Ex2
//        funcionario.setCodigo(0);// alterando os dados Ex2

        Gerente gerente = new Gerente("leonardo",54,"leon","4716");
        gerente.calculaBonificacao(2);
    }
}
