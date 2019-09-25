package staticos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Funcionario.valeRefeicaodiario);// Faça um teste para verificar o funcionamento do vale refeição.
        System.out.println("Digite um valor para reajustar o vale refeição");
        double taxa = sc.nextDouble();

        Funcionario.reajuste(taxa);// passando valor sem instancia

        System.out.println(Funcionario.valeRefeicaodiario);// teste para verificar o funcionamento do reajuste do vale refeição.
    }
}
