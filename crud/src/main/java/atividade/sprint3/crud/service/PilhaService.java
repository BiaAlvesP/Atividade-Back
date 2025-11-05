package atividade.sprint3.crud.service;

import atividade.sprint3.crud.entity.ChamadosModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class PilhaService {

    private Stack<ChamadosModel> chamadosEmergenciais = new Stack<>();
    private int proximoId;

    public ChamadosModel adicionarChamado(String chamado, String cliente, String urgencia) {
        ChamadosModel novoChamado = new ChamadosModel(proximoId++, chamado, cliente, urgencia);
        chamadosEmergenciais.push(novoChamado);
        return novoChamado;
    }

    public ChamadosModel resolucaoImediata(){
       if (chamadosEmergenciais.isEmpty()){
           return null;
       }

       return chamadosEmergenciais.pop();
    }

    public ChamadosModel verProximoChamado(){
        if (chamadosEmergenciais.isEmpty()){
            return null;
        }

        return chamadosEmergenciais.peek();
    }

    public List<ChamadosModel> listarChamados(){
        return new ArrayList<>(chamadosEmergenciais);
    }

    public int quantidadeEmEspera() {
        return chamadosEmergenciais.size();
    }
}
