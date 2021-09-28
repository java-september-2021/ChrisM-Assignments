package com.chrism.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chrism.lookify.models.Music;
import com.chrism.lookify.services.MusicService;

@Controller
public class HomeController {
	private MusicService musicService;
	public HomeController(MusicService musicService) {
		this.musicService = musicService;
	}
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model viewModel) {
		List<Music> music = musicService.allMusic();
		viewModel.addAttribute("music", music);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("music") Music music) {
		return "new.jsp";
	}
	
	@PostMapping("/songs/new")
	public String create(@Valid @ModelAttribute("music") Music music, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			musicService.createMusic(music);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/songs/top")
	public String topTen(Model viewModel) {
		viewModel.addAttribute("topMusic", musicService.top10Songs());
		return "topTen.jsp";
	}
	
	@GetMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		Music thisSong = musicService.getOneSong(id);
		viewModel.addAttribute("thisSong", thisSong);
		return "showSong.jsp";
	}
	
	@GetMapping("/search")
	public String showSearch(@RequestParam("searchBox") String search, Model viewModel) {
		viewModel.addAttribute("songs", musicService.searchByArtist(search));
		viewModel.addAttribute("artist", search); //TODO: Get this working next!
		return "search.jsp";
	}
	
	@RequestMapping(value="/{id}/delete", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		musicService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	
	
	
	
	
	
}
