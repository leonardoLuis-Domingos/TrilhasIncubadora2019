package herancaCapitulo8;

public class Funcionario {

    private String nome;
    private double salario;
    private double bonificacao;

    public Funcionario(String nome, double salario, double bonificacao) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void motraDados(){

        System.out.println("Nome: "+ nome +"\n" + "Salario: "+ salario + "\n" +
                "Bonificação: " + bonificacao);
    }
}
