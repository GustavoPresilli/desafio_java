package Desafio.Aplicacao;

import Desafio.Banco.DAO.RegistrosDAO;
import Desafio.Captura.Cpu;
import Desafio.Captura.Disco;
import Desafio.Captura.Memoria;
import com.github.britooo.looca.api.core.Looca;

import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer totemEscolhido;

        do {
            System.out.println("Digite um totem: ");
            totemEscolhido = input.nextInt();

        } while (Objects.isNull(totemEscolhido));

        Timer timer = new Timer();

        Integer finalTotemEscolhido = totemEscolhido;
        TimerTask capturarDados = new TimerTask() {
            @Override
            public void run() {
                Timer timer = new Timer();

                Looca looca = new Looca();

                Cpu cpu = new Cpu();
                Memoria memoria = new Memoria();
                Desafio.Captura.Disco disco = new Disco();

                RegistrosDAO registroDAO = new RegistrosDAO();

                int usoDiscos = disco.getCaptura();
                int usoCpu = cpu.getCaptura();
                int usoMemoria = memoria.getCaptura();

                System.out.println("----------------------------------------------------------------");
                System.out.println("CPU: " + usoCpu + "%");
                System.out.println("Memória: " + usoMemoria + "%");
                System.out.println("Disco: " + usoDiscos + "%");


                registroDAO.inserirDados(finalTotemEscolhido, 1, usoCpu);
                registroDAO.inserirDados(finalTotemEscolhido, 2, usoMemoria);
                registroDAO.inserirDados(finalTotemEscolhido, 3, usoDiscos);

            }

        };

        timer.schedule(capturarDados, 0, 3000);
    }
}