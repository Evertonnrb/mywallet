package com.mywallet.model.enuns;

public enum Tipo {
    ALIMENTACAO("Alimentação"),
    COMBUSTIVEL("Combustível"),
    SAUDE("Saúde"),
    IMPOSTOS("Impostos"),
    OUTROS("Outros");

    private String tipoDespesa;

    Tipo(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }


}
