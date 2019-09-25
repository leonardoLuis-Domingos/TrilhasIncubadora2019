package encapsulamento;

public class Banco {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Banco(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Banco" + "\n"+
                "NumeroConta: " + numeroConta +
                " Nome: " + nome + '\'' +
                " Saldo: " + saldo;

    }
}
