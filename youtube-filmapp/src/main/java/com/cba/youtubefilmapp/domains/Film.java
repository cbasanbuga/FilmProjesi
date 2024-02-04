package com.cba.youtubefilmapp.domains;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private long id;
	
	@NotBlank(message = "Film adi bos olamaz!")
	@Size(min = 2, max = 50, message = "Film adi '${validatedValue}' {min} ve {max} karakter arasında olmalıdır!")
	@Column(nullable = false, length = 50)
	private String filmName;
	
	@NotBlank(message = "Film yili bos olamaz!")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy")
	private String releaseYear;
	
	private double imdbRating;
	
	@NotBlank(message = "Film yapimcisi bos olamaz!")
	@Size(min = 2, max = 50, message = "Film yapimcisi '${validatedValue}' {min} ve {max} karakter arasında olmalıdır!")
	@Column(nullable = false, length = 50)
	private String procedure;
	
	@NotBlank(message = "Film turu bos olamaz!")
	@Size(min = 2, max = 50, message = "Film turu '${validatedValue}' {min} ve {max} karakter arasında olmalıdır!")
	@Column(nullable = false, length = 50)
	private String genre;
	
	

}
