package exercicioMetodos;

public class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public double aumentaSalario(Double aumento){
         salario += aumento;
        return salario;
    }

    public void dadosFuncionario(){
        System.out.println(nome);
        System.out.println(salario);
    }
}
