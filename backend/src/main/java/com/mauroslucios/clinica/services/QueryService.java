package com.mauroslucios.clinica.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauroslucios.clinica.dto.QueryDTO;
import com.mauroslucios.clinica.entities.Query;
import com.mauroslucios.clinica.repositories.QueryRepository;

@Service
public class QueryService {

	@Autowired
	private QueryRepository queryRepository;
	
	@Transactional(readOnly = true)
	public List<QueryDTO> findAl(){
		/*
		 * findOrdersWithQUerys()
		 */
		List<Query> list = queryRepository.findAllByOrderByMomentAsc();
		return list.stream().map(x -> new QueryDTO(x)).collect(Collectors.toList());
	}
}




