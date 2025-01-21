package com.study.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {}
