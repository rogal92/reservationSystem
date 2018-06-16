package com.example.reservation.validation;

import com.example.reservation.entities.ReservationStatus;
import com.example.reservation.util.ValidationMsg;

import java.util.Optional;

public class ReservationStatusValidation extends ValidatorHelper implements Validator<ReservationStatus> {

    @Override
    public Optional<ValidationError> validate(ReservationStatus reservationStatus) {
        if (isNullOrEmptyStr(reservationStatus.getReservationStatus()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
