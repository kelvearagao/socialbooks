package com.kelvearagao.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelvearagao.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
