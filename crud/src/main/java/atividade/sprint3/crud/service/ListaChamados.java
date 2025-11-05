package atividade.sprint3.crud.service;

import atividade.sprint3.crud.entity.ChamadosModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ListaChamados extends ChamadosComuns {


    private List<ChamadosModel> chamados = new ArrayList<ChamadosModel>();

    public void cadastrarChamado(ChamadosModel chamado) {
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

    public List<ChamadosModel> listarHistorico() {
        return new ArrayList<>(chamados);
    }

    public int quantidadeResolvidos() {
        return chamados.size();
    }

    public Map<String, Long> chamadosPorTipo() {
        return chamados.stream()
                .collect(Collectors.groupingBy(
                        ChamadosModel::getUrgencia,
                        Collectors.counting()
                ));
    }
}
