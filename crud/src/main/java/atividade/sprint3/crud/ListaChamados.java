package atividade.sprint3.crud;

import java.util.ArrayList;
import java.util.List;

public class ListaChamados {
    private List<String> chamados = new ArrayList<String>();

    // Cadastrar um novo chamado no histórico
    public void cadastrarLivro(String chamado) {
        System.out.println("\nCadastrando chamado: " + chamado);
        chamados.add(chamado);
        exibirCatalogo();
    }

    // Listar todos os chamados
    public void exibirCatalogo() {
        if (chamados.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado no histórico!");
        } else {
            System.out.println("Histórico atual: " + chamados);
        }
    }


}
