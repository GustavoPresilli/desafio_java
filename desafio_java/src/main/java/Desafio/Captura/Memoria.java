package Desafio.Captura;

import com.github.britooo.looca.api.core.Looca;

public class Memoria extends Componentes {
    public Memoria(int idComponente, String nomeComponente, String unidadeMedicao) {
        super(idComponente, nomeComponente, unidadeMedicao);
    }

    public Memoria() {
        super();

    }

    public int getCaptura(){
        Looca looca = new Looca();

        com.github.britooo.looca.api.group.memoria.Memoria memoria = looca.getMemoria();

        Double usoMemoria = (double) ((memoria.getEmUso() * 100) / memoria.getTotal());

        return usoMemoria.intValue();
    }
}
