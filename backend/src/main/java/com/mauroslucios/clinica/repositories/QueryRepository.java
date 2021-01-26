package com.mauroslucios.clinica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroslucios.clinica.entities.Query;

public interface QueryRepository extends JpaRepository<Query, Long> {

	public List<Query> findAllByOrderByMomentAsc();

	/* @Query("SELECT DISTINCT obj FROM Query obj JOIN FETCH obj.querys"
	 * 			+ "WHERE obj.status = 0 ORDER BY obj.moment ASC")
	 * List<Query> findOrdersWithQUerys();
	 */
}
