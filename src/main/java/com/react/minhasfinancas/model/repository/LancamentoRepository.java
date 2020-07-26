package com.react.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
