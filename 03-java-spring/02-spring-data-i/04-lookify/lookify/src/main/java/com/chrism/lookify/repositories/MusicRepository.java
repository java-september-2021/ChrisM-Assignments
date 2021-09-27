package com.chrism.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chrism.lookify.models.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long> {
	List<Music> findAll();
	
	List<Music> findTop10ByOrderByRatingDesc();
	
	List<Music> findByartistNameContaining(String artist);
}
