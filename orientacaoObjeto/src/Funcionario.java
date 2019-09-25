public class Funcionario {

    private String cargo;
    private double salario;

    public Funcionario(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "cargo: " + cargo +
                " salario: " + salario;

    }
}
