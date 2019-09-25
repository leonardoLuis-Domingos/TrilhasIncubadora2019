package herancaCapitulo8;

public class Secretaria extends Funcionario{

    private int numero;

    public Secretaria(String nome, double salario, double bonificacao, int numero) {
        super(nome, salario, bonificacao);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void motraDados() {
        super.motraDados();
        System.out.println("Numero: "+ numero);
    }
}
