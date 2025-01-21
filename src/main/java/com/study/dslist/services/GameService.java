package com.study.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.dslist.dto.GameDTO;
import com.study.dslist.dto.GameMinDTO;
import com.study.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		var entity = gameRepository.findAll();
		
		return entity.stream().map(x -> new GameMinDTO(x)).toList(); 
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		var entity = gameRepository.findById(id).get();
		var dto = new GameDTO(entity);
		
		return dto; 
	}
}
