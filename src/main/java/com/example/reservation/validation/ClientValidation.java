package com.example.reservation.validation;

import com.example.reservation.entities.Client;
import com.example.reservation.util.ValidationMsg;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientValidation extends ValidatorHelper implements Validator<Client> {

    @Override
    public Optional<ValidationError> validate(Client client) {
        if (isNullOrEmptyStr(client.getName()) || isNullOrEmptyStr(client.getSurname()) ||
                isNullOrEmptyStr(client.getAddress()) ||
                isValidEmailAddress(client.geteMail())) ||
                isGreaterThanZero(client.getPhoneNumber()) ||
                isValidEmailAddress(client.geteMail()))
            return Optional.of(new ValidationError(ValidationMsg.DATA_NOT_FILLED_OR_BAD_DATA));
        return Optional.empty();
    }
}
