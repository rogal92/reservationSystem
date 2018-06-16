package com.example.reservation.validation;

public class ValidationError {

    private String message;

    public ValidationError(String message) {
        this.message = message;
    }

    public void getMessage() {
        return message;
    }
}
