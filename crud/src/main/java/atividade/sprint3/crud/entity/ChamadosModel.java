package atividade.sprint3.crud.entity;

public class ChamadosModel {
    private Integer id;
    private String chamado;
    private String cliente;
    private String urgencia;


    public ChamadosModel() {
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

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    @Override
    public String toString() {
        return "ChamadosModel{" +
                "id=" + id +
                ", chamado='" + chamado + '\'' +
                ", cliente='" + cliente + '\'' +
                ", urgencia='" + urgencia + '\'' +
                '}';
    }
}