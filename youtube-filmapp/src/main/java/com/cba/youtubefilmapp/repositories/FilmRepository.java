package com.cba.youtubefilmapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cba.youtubefilmapp.domains.Film;

public class FilmRepository extends JpaRepository<Film, Long> {

}
