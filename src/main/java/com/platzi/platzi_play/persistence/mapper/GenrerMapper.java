package com.platzi.platzi_play.persistence.mapper;

import com.platzi.platzi_play.domain.Genre;
import kotlin.io.encoding.Base64;
import org.mapstruct.Named;

public class GenrerMapper {

    @Named("stringToGenre")
    public static Genre StringToGenre(String genero){
        if (genero == null) return null;

        return switch (genero.toUpperCase()){
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "DRAMA" ->  Genre.DRAMA;
            case "ANIMADA" -> Genre.ANIMATED;
            case "TERROR" -> Genre.HORROR;
            case "CIENCIA FICCION" -> Genre.SCI_FI;
            default -> null;
        };
    }

    @Named("genreToString")
    public static String genreToString(Genre genre){
        if (genre ==null)return null;

        return switch (genre){
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case DRAMA -> "DRAMA";
            case ANIMATED -> "ANIMADA";
            case HORROR -> "TERROR";
            case SCI_FI -> "CIENCIA FICCION";
        };
    }
}
