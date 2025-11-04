package atividade.sprint3.crud;

import java.util.LinkedList;
import java.util.Queue;

public class ChamadosComuns {

    private Queue<String> fila = new LinkedList<String>();

    // adição de um usuário à fila
    public void adicionarChamado(String chamado) {
        System.out.println("\nAdicionando chamado à fila: " + chamado   );
        fila.add(chamado);
        exibirFila();
    }

    // Atender/remover o próximo usuário da fila
    public void atenderChamado() {
        if (fila.isEmpty()) {
            System.out.println("\nNenhum chamado na fila!");
        } else {
            String atendido = fila.poll(); // Remove o primeiro da fila
            System.out.println("\nAtendendo o chamado: " + atendido);
            exibirFila();
        }
    }

    // Exibição do estado atual da fila
    public void exibirFila() {
        System.out.println("Fila atual: " + fila);
    }

}
