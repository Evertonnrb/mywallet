package com.mywallet.service;

import com.mywallet.model.Despesa;
import com.mywallet.repository.Despesas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    @Autowired
    private Despesas despesas;

    public void cadastrar(Despesa despesa) {
        despesas.save(despesa);
    }

    public void remover(Long cod) {
        despesas.deleteById(cod);
    }
}
