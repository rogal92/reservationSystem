package com.example.reservation.validation;

import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.util.ValidationMsg;

import java.util.Optional;

public class PaymentMethodValidation extends ValidatorHelper implements Validator<PaymentMethod> {

    @Override
    public Optional<ValidationError> validate(PaymentMethod paymentMethod) {
        if (isNullOrEmptyStr(paymentMethod.getMethodName()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
