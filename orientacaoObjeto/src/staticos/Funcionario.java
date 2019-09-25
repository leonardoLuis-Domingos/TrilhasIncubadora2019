package staticos;

public class Funcionario {

    static double valeRefeicaodiario = 50.65;

    public static void reajuste(double taxa){

        valeRefeicaodiario += taxa;
    }
}
