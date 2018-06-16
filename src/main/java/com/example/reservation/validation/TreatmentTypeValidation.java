package com.example.reservation.validation;

import com.example.reservation.entities.TreatmentType;
import com.example.reservation.util.ValidationMsg;

import java.util.Optional;

public class TreatmentTypeValidation extends ValidatorHelper implements Validator<TreatmentType> {

    @Override
    public Optional<ValidationError> validate(TreatmentType treatmentType) {
        if (isNullOrEmptyStr(treatmentType.getTreatmentDescription()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
