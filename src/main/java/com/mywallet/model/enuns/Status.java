package com.mywallet.model.enuns;

public enum Status {
    RECEBIDO("Recebido"), PENDENDE("Pendente");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
