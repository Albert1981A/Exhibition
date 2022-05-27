package com.AlbertAbuav.Exhibition.exceptions;

public enum ErrorMessage {
    ID_ALREADY_EXIST("Id already exist"),
    ID_NOT_FOUND("Id not found");

    private String description;

    ErrorMessage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
