import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private Integer rg;
    private Date data;
    private Turma turma;


    public Aluno(String nome,Integer rg,Date data,Turma turma){
        this.nome = nome;
        this.rg = rg;
        this.data = data;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno" + "\n" +
                "Nome: " + nome + "\n" +
                "Rg: " + rg;


    }
}
