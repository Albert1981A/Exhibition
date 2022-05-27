package com.AlbertAbuav.Exhibition.exceptions;

public class ExhibitionSystemException extends Exception{

    public ExhibitionSystemException(ErrorMessage errorMessage) {
        super(errorMessage.getDescription());
    }
}
