package com.cba.youtubefilmapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cba.youtubefilmapp.services.FilmService;

import jakarta.validation.Valid;

import com.cba.youtubefilmapp.domains.Film;

@RestController
@RequestMapping("/api")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	//NOT: GET_ALL_FILMS
	@GetMapping("/films")
	public ResponseEntity<List<Film>> ListAllFilms(){
		
		List<Film> films = filmService.getAllFilms();
		
		return ResponseEntity.ok(films); 
		
	}
	
	//NOT: CREATE a new Film
	@PostMapping("/films")
	public ResponseEntity<Map<String, String>> createFilm(@Valid @RequestBody Film film){
		filmService.createNewFilm(film);		
		Map<String, String> map = new HashMap<>();
		map.put("message", "Film başarı ile eklendi!");
		map.put("status", "true");
		return new ResponseEntity<>(map,HttpStatus.CREATED);
	}
		
	//NOT: GET a Film
	@GetMapping("/films/{id}")
	public ResponseEntity<Film> getFilmById(@PathVariable("id") Long id){
		return ResponseEntity.ok(filmService.findFilm(id));
	}
		
	//NOT: DELETE Film
		
	//NOT: UPDATE Film
}
