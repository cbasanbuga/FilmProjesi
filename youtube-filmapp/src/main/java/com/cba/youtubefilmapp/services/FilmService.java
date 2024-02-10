package com.cba.youtubefilmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cba.youtubefilmapp.repositories.FilmRepository;

import com.cba.youtubefilmapp.domains.Film;
import com.cba.youtubefilmapp.exceptions.ResourceNotFoundException;

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
	public Film findFilm(Long id) {
		return filmRepository.findById(id).orElseThrow(()-> 
			new ResourceNotFoundException(id + " numaralı film bulunamadı"));
	}
	
	//NOT: DELETE Film
	public void deleteFilm(Long id) {
		Film film = findFilm(id);
		filmRepository.delete(film);
	}
	
	//NOT: UPDATE Film
	
	
}
