package com.study.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.dslist.dto.GameListDTO;
import com.study.dslist.dto.GameMinDTO;
import com.study.dslist.dto.ReplacementDTO;
import com.study.dslist.services.GameListService;
import com.study.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		return gameListService.findAll();
	}
	
	@GetMapping(value= "/{listId}/games")
	public List<GameMinDTO> findBylist(@PathVariable Long listId){
		
		return gameService.findbyList(listId);
	}
	
	@PostMapping(value= "/{listId}/replacement",
			consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		
//		System.out.print("Request body!!!" + body.getDestinationIndex() );
//		System.out.print("Request body!!!" + body.getSourceIndex() );
		
		 gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}

}


