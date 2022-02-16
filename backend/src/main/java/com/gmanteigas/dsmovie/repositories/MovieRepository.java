package com.gmanteigas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmanteigas.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{

}
