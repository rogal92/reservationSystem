package com.example.reservation.validation;

import com.example.reservation.entities.Payment;
import com.example.reservation.util.ValidationMsg;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PaymentValidator extends ValidatorHelper implements Validator<Payment> {

    @Override
    public Optional<ValidationError> validate(Payment payment) {
        if (isNullValue(payment.getPaymentMethod()) ||
                isNullValue(payment.getPaymentsDate()) ||
                isGreaterThanZero(payment.getValue()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
