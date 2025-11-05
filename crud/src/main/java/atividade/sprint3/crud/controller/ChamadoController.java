package atividade.sprint3.crud.controller;

import atividade.sprint3.crud.service.ListaChamados;
import atividade.sprint3.crud.service.ChamadosComuns;
import atividade.sprint3.crud.service.PilhaService;
import atividade.sprint3.crud.entity.ChamadosModel;
import atividade.sprint3.crud.dto.ChamadoRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
@AllArgsConstructor
public class ChamadoController {

    private final ChamadosComuns chamadosComuns;
    private final PilhaService pilhaService;
    private final ListaChamados listaChamados;

    @PostMapping("/comum")
    public ResponseEntity<ChamadosModel> criarChamadoComum(@RequestBody ChamadoRequest request) {
        ChamadosModel chamado = chamadosComuns.adicionarChamado(
                request.getChamado(),
                request.getCliente(),
                "comum"
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(chamado);
    }

    @GetMapping("/comum/espera")
    public ResponseEntity<List<ChamadosModel>> listarChamadosEmEspera() {
        List<ChamadosModel> chamados = chamadosComuns.listarChamados();
        return ResponseEntity.ok(chamados);
    }

    @DeleteMapping("/comum/atender")
    public ResponseEntity<ChamadosModel> atenderChamadoComum() {
        ChamadosModel atendido = chamadosComuns.atenderChamado();
        if (atendido == null) {
            return ResponseEntity.noContent().build();
        }
        listaChamados.cadastrarChamado(atendido);
        return ResponseEntity.ok(atendido);
    }

    @PostMapping("/emergencia")
    public ResponseEntity<ChamadosModel> criarChamadoEmergencia(@RequestBody ChamadoRequest request) {
        ChamadosModel chamado = pilhaService.adicionarChamado(
                request.getChamado(),
                request.getCliente(),
                "emergencia"
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(chamado);
    }

    @GetMapping("/emergencia/espera")
    public ResponseEntity<List<ChamadosModel>> listarChamadosEmergenciais() {
        List<ChamadosModel> chamados = pilhaService.listarChamados();
        return ResponseEntity.ok(chamados);
    }

    @DeleteMapping("/emergencia/resolver")
    public ResponseEntity<ChamadosModel> resolverEmergencia() {
        ChamadosModel resolvido = pilhaService.resolucaoImediata();
        if (resolvido == null) {
            return ResponseEntity.noContent().build();
        }
        listaChamados.cadastrarChamado(resolvido);
        return ResponseEntity.ok(resolvido);
    }


    @GetMapping("/historico")
    public ResponseEntity<List<ChamadosModel>> consultarHistorico() {
        List<ChamadosModel> historico = listaChamados.listarHistorico();
        return ResponseEntity.ok(historico);
    }
}
