package com.mywallet.service;

import com.mywallet.model.Receita;
import com.mywallet.repository.Receitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {

    @Autowired
    private Receitas receitas;

    public void cadastrarReceita(Receita receita) {
        receitas.save(receita);
    }

    public void removerReceita(Long codigo) {
        receitas.deleteById(codigo);
    }
}
