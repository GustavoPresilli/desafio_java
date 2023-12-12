package Desafio.Captura;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processador.Processador;

public class Cpu extends Componentes {
    public Cpu(int idComponente, String nomeComponente, String unidadeMedicao) {
        super(idComponente, nomeComponente, unidadeMedicao);
    }

    public Cpu() {
    }

    public int getCaptura() {
        Looca looca = new Looca();

        Processador processador = looca.getProcessador();

        int usoProcessador = processador.getUso().intValue();

        return usoProcessador;
    }

}
