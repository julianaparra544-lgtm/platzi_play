package com.platzi.platzi_play.domain.exception;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String movieTitle){
        super("la pelicula" + movieTitle +  "ya existe.");
    }

}
