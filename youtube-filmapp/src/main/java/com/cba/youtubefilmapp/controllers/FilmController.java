package com.cba.youtubefilmapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cba.youtubefilmapp.services.FilmService;

@RestController
@RequestMapping("films")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	//NOT: GET_ALL_FILMS
	
	//NOT: CREATE a new Film
		
	//NOT: GET a Film
		
	//NOT: DELETE Film
		
	//NOT: UPDATE Film
}
