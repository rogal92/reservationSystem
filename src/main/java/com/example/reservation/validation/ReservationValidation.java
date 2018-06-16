package com.example.reservation.validation;

import com.example.reservation.entities.Reservation;
import com.example.reservation.util.ValidationMsg;

import java.util.Optional;

public class ReservationValidation extends ValidatorHelper implements Validator<Reservation> {

    @Override
    public Optional<ValidationError> validate(Reservation reservation) {
        if (isNullValue(reservation.getClient()) ||
                isNullValue(reservation.getPayment()) ||
                isDateNull(reservation.getReservationDate()) ||
                isGreaterThanZero(reservation.getAmount()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
