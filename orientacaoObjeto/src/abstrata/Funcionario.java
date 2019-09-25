package abstrata;

public abstract class Funcionario {

    private String nome;
    private int codigo;
    protected double bonificacao = 200;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public abstract void calculaBonificacao(double taxa);
}
