package herancaCapitulo8;

public class Gerente extends Funcionario{

    private int premio;

    public Gerente(String nome, double salario, double bonificacao, int premio) {
        super(nome, salario, bonificacao);
        this.premio = premio;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    @Override
    public void motraDados() {
        super.motraDados();
        System.out.println("Premio: "+ premio);
    }
}
