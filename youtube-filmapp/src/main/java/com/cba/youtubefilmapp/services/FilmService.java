package com.cba.youtubefilmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cba.youtubefilmapp.repositories.FilmRepository;

import com.cba.youtubefilmapp.domains.Film;
import java.util.List;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepository;
	
	//NOT: GET_ALL_FILMS
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();
	}

	//NOT: CREATE a new Film
	public void createNewFilm(Film film) {
		filmRepository.save(film);
	}


	
	
	
	
	
	//NOT: GET a Film
	
	//NOT: DELETE Film
	
	//NOT: UPDATE Film
	
	
}
