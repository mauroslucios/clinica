package com.mauroslucios.clinica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroslucios.clinica.entities.Query;

public interface QueryRepository extends JpaRepository<Query, Long> {

	public List<Query> findAllByOrderByMomentAsc();
}
