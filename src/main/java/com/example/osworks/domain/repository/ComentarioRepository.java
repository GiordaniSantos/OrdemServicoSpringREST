package com.example.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.osworks.api.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
		
}
