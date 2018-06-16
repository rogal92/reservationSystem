package com.example.reservation.validation;

import com.example.reservation.entities.Address;
import com.example.reservation.util.ValidationMsg;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AddressValidation extends ValidatorHelper implements Validator<Address> {

    @Override
    public Optional<ValidationError> validate(Address address) {

        if (isNullOrEmptyStr(address.getCity()) || isNullOrEmptyStr(address.getStreet())) {
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        }
        return Optional.empty();
    }
}
