package Desafio.Banco.Tabelas;

public class Registros {
    private int idRegistro;
    private int valor;
    private String dataHora;
    private int fkComponente;

    public Registros(int idRegistro, int valor, String dataHora, int fkComponente) {
        this.idRegistro = idRegistro;
        this.valor = valor;
        this.dataHora = dataHora;
        this.fkComponente = fkComponente;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public int getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(int fkComponente) {
        this.fkComponente = fkComponente;
    }
}
