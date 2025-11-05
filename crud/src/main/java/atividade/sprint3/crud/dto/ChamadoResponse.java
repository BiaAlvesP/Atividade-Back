package atividade.sprint3.crud.dto;

public class ChamadoResponse {
    private int emEspera;
    private int emEsperaComum;
    private int emEsperaEmergencia;
    private int resolvidos;
    private long resolvidosComum;
    private long resolvidosEmergencia;

    public ChamadoResponse(int emEspera, int emEsperaComum, int emEsperaEmergencia,
                                int resolvidos, long resolvidosComum, long resolvidosEmergencia) {
        this.emEspera = emEspera;
        this.emEsperaComum = emEsperaComum;
        this.emEsperaEmergencia = emEsperaEmergencia;
        this.resolvidos = resolvidos;
        this.resolvidosComum = resolvidosComum;
        this.resolvidosEmergencia = resolvidosEmergencia;
    }

    public int getEmEspera() { return emEspera; }
    public int getEmEsperaComum() { return emEsperaComum; }
    public int getEmEsperaEmergencia() { return emEsperaEmergencia; }
    public int getResolvidos() { return resolvidos; }
    public long getResolvidosComum() { return resolvidosComum; }
    public long getResolvidosEmergencia() { return resolvidosEmergencia; }
}
