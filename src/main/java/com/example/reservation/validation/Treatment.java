package com.example.reservation.validation;

import com.example.reservation.entities.Treatment;
import com.example.reservation.util.ValidationMsg;

import java.util.Optional;

public class TreatmentValidation extends ValidatorHelper implements Validator<Treatment> {

    @Override
    public Optional<ValidationError> validate(Treatment treatment) {
        if (isNullOrEmptyStr(treatment.getTreatmentName()) ||
                isNullValue(treatment.getTreatmentType())
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
