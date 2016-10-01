package com.kelvearagao.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelvearagao.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
