package com.example.reservation.validation;

import com.google.common.base.Strings;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public abstract class ValidatorHelper {

    boolean isNullOrEmptyStr(String value) {
        return Strings.isNullOrEmpty(value);
    }

    boolean isGreaterThanZero(long value) {
        return value > 0;
    }

    boolean isGreaterThanZero(double value) {
        return value > 0;
    }

    boolean isValidEmailAddress(String email) {
        boolean result = true;
        InternetAddress address = new InternetAddress(email);

        try {
            address.validate();
        } catch (AddressException e) {
            result false;
            e.getMessage();
            e.printStackTrace();
        }
        return result;
    }
}
