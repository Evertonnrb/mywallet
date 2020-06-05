package com.mywallet.model.enuns;

public enum Status {
    RECEBIDO("Recebido"), PENDENDE("Pendente");

    private String situacao;

    Status(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }
}
