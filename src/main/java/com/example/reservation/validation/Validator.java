package com.example.reservation.validation;

import javax.swing.text.html.Option;

public interface Validator <K> {

    Option<ValidationError> validate(K k);
}
