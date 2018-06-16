package com.example.reservation.validation;

import com.example.reservation.entities.TreatmentReservation;
import com.example.reservation.util.ValidationMsg;

import javax.swing.text.html.Option;
import java.util.Optional;

public class TreatmentReservationValidation extends ValidatorHelper implements Validator<TreatmentReservation> {

    @Override
    public Optional<ValidationError> validate(TreatmentReservation treatmentReservation) {
        if (isNullValue(treatmentReservation.getReservation()) ||
                isNullValue(treatmentReservation.getTreatment()) ||
                isGreaterThanZero(treatmentReservation.getTreatmentPrice()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
