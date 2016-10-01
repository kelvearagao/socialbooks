package com.kelvearagao.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelvearagao.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
