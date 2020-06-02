package com.mywallet.repository;

import com.mywallet.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Despesas extends JpaRepository<Despesa, Long> {

}
