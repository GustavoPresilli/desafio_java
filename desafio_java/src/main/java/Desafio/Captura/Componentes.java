package Desafio.Captura;

public abstract class Componentes {

    private int idComponente;
    private String nomeComponente;
    private String unidadeMedicao;

    public Componentes(int idComponente, String nomeComponente, String unidadeMedicao) {
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.unidadeMedicao = unidadeMedicao;
    }

    public Componentes() {

    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public String getUnidadeMedicao() {
        return unidadeMedicao;
    }

    public void setUnidadeMedicao(String unidadeMedicao) {
        this.unidadeMedicao = unidadeMedicao;
    }
}
