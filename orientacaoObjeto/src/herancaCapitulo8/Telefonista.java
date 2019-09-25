package herancaCapitulo8;

public class Telefonista extends Funcionario{

    private String registro;

    public Telefonista(String nome, double salario, double bonificacao, String registro) {
        super(nome, salario, bonificacao);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public void motraDados() {
        super.motraDados();
        System.out.println("Registro: "+ registro);
    }
}
