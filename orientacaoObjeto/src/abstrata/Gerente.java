package abstrata;

public class Gerente extends Funcionario{

    private String login;
    private String senha;

    public Gerente(String nome, int codigo, String login, String senha) {
        super(nome, codigo);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public  void calculaBonificacao(double taxa){
        bonificacao += taxa *2;
        System.out.println(bonificacao);
    }
}
