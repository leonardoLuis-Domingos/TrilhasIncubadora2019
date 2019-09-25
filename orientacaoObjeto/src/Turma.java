public class Turma {
    private String periodo;
    private String serie;
    private char sigla;
    private String ensino;

    public Turma(String periodo, String serie, char sigla, String ensino) {
        this.periodo = periodo;
        this.serie = serie;
        this.sigla = sigla;
        this.ensino = ensino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    @Override
    public String toString() {
        return "Turma" + "\n"+
                "periodo: " + periodo + "\n"+
                " serie: " + serie + "\n"+
                " sigla " + sigla + "\n"+
                " ensino " + ensino;

    }
}
