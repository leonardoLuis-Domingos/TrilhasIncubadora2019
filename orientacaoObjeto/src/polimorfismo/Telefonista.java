package polimorfismo;

public class Telefonista extends Funcionario {

    private int ramal ;

    public Telefonista(int codigo, String nome, int ramal) {
        super(codigo, nome);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }


}
