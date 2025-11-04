package atividade.sprint3.crud.controller;

import atividade.sprint3.crud.ChamadosComuns;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
@RequiredArgsConstructor
public class ChamadoController {

    private final ChamadosComuns chamadosComuns;

    @GetMapping
    public List<ResponseEntity<T>> ListarAtendimentos(){
        return null;
    }

    @GetMapping("/espera")
    public List<ResponseEntity<T>> ListarEmEspera(){
        return null;
    }

    @PostMapping
    public ResponseEntity<T> AtenderChamado(){
        return null;
    }

    @PostMapping("/criar")
    public ResponseEntity<ChamadosComuns> CriarChamado(@RequestBody String chamado){

        chamadosComuns.adicionarChamado(chamado);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/urgencia")
    public ResponseEntity<T> CriarChamadoUrgente(@RequestBody String chamado){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/estatisticas")
    public ResponseEntity<T> RetornarEstatisticas(){
        return null;
    }
}
