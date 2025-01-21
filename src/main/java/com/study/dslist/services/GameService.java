package com.study.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dslist.dto.GameDTO;
import com.study.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> findAll() {
		var entity = gameRepository.findAll();
		
		return entity.stream().map(x -> new GameDTO(x)).toList(); 
	}
}
