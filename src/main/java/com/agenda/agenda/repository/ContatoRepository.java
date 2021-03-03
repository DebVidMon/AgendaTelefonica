package com.agenda.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.model.ContatoModel;  
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
		
}

