package com.mywallet.repository;

import com.mywallet.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Receitas extends JpaRepository<Receita,Long> {
}
