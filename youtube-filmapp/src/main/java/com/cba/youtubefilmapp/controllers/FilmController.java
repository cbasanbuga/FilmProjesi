package com.cba.youtubefilmapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cba.youtubefilmapp.services.FilmService;
import com.cba.youtubefilmapp.domains.Film;

@RestController
@RequestMapping("films")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	//NOT: GET_ALL_FILMS
	@GetMapping
	public ResponseEntity<List<Film>> ListAllFilms(){
		
		List<Film> films = filmService.getAllFilms();
		
		return ResponseEntity.ok(films);
		
	}
	
	
	//NOT: CREATE a new Film
		
	//NOT: GET a Film
		
	//NOT: DELETE Film
		
	//NOT: UPDATE Film
}
