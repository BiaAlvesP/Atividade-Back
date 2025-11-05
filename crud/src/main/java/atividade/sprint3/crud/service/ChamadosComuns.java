package atividade.sprint3.crud.service;

import atividade.sprint3.crud.entity.ChamadosModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class ChamadosComuns {

    private Queue<ChamadosModel> filaComuns = new LinkedList<>();
    private int proximoId = 0;

    public ChamadosModel adicionarChamado(String chamado, String cliente, String urgencia) {
        ChamadosModel novoChamado = new ChamadosModel(proximoId++, chamado, cliente, urgencia);
        filaComuns.add(novoChamado);
        return novoChamado;
    }

    public ChamadosModel atenderChamado() {
        if (filaComuns.isEmpty()) {
            return null;
        }
        return filaComuns.poll();
    }

    public ChamadosModel verProximoChamado() {
        if (filaComuns.isEmpty()) {
            return null;
        }
        return filaComuns.peek();
    }

    public List<ChamadosModel> listarChamados() {
        return new ArrayList<>(filaComuns);
    }

    public int quantidadeEmEspera() {
        return filaComuns.size();
    }

}
