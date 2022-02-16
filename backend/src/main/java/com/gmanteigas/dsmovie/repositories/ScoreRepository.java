package com.gmanteigas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmanteigas.dsmovie.entities.Score;
import com.gmanteigas.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK>{

}
