package com.study.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {}
