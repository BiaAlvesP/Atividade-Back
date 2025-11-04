package atividade.sprint3.crud;

import java.util.ArrayList;
import java.util.List;

public class ListaChamados extends ChamadosComuns{


    private List<String> chamados = new ArrayList<String>();

    // Cadastrar um novo chamado no histórico
    public void cadastrarChamado(String chamado) {
        System.out.println("\nCadastrando chamado: " + chamado);
        chamados.add(chamado);
        exibirChamados();
    }

    // Listar todos os chamados
    public void exibirChamados() {
        if (chamados.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado no histórico!");
        } else {
            System.out.println("Histórico atual: " + chamados);
        }
    }


}
