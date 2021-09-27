package com.chrism.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.lookify.models.Music;
import com.chrism.lookify.repositories.MusicRepository;

@Service
public class MusicService {
	//I know I can do @Autowired here, but I like to see how it's done each time.  
	//Maybe once I'm more comfortable
	private MusicRepository musicRepo;
	public MusicService(MusicRepository musicRepo) {
		this.musicRepo = musicRepo;
	}
	
	public List<Music> allMusic() {
		return this.musicRepo.findAll();
	}
	
	public Music createMusic(Music newSong) {
		return this.musicRepo.save(newSong);
	}
	
	public Music updateMusic(Music updateSong) {
		return this.musicRepo.save(updateSong);
	}
	
	public Music getOneSong(Long id) {
		return this.musicRepo.findById(id).orElse(null);
	}
	
	public void deleteSong(Long id) {
		this.musicRepo.deleteById(id);
	}
	
	public List<Music> top10Songs() {
		return this.musicRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Music> searchByArtist(String artist) {
		return this.musicRepo.findByartistNameContaining(artist);
	}
	
}
