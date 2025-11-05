package atividade.sprint3.crud.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class ChamadosModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String chamado;
    private String cliente;
    private String urgencia;

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public ChamadosModel(Integer id, String chamado, String cliente, String urgencia) {
        this.id = id;
        this.chamado = chamado;
        this.cliente = cliente;
        this.urgencia = urgencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChamado() {
        return chamado;
    }

    public void setChamado(String chamado) {
        this.chamado = chamado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
