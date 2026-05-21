package com.platzi.platzi_play.domain.dto;

import com.platzi.platzi_play.domain.Genre;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "El titulo es obligatorio")
        String title,

        @PastOrPresent(message = "la fecha de lanzamiento debe ser anterior a la fecha actual")
        LocalDate releaseDate,

        @Min(value = 0,message = "el rating no puede ser menor que 0")
        @Max(value = 5, message = "el rating no puede ser mayor que 5")
        double rating
       ){
     }
