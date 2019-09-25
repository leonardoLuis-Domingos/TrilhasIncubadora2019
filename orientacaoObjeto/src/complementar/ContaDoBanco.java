package complementar;

public class ContaDoBanco {

    private Integer numero;
    private Double limite;
    private Double saldo;

    public ContaDoBanco(Integer numero, Double limite, Double saldo) {
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double deposito){

        saldo += deposito;
    }

    public void sacar(double saque){

        if(saque > limite){
            System.out.println("Soldo insuficiente");
        }else{
            saldo -= saque;
        }
    }

    @Override
    public String toString() {
        return "ContaDoBanco:" + "\n" +
                "Numero: " + numero + "\n" +
                "limite=" + limite + "\n" +
                "Saldo=" + saldo;

    }
}
