package com.study.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.dslist.dto.GameListDTO;
import com.study.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		var entity = gameListRepository.findAll();
		
		return entity.stream().map(x -> new GameListDTO(x)).toList(); 
	}

}
