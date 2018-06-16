package com.example.reservation.time;

import java.util.Date;

public class DefaultCurrentTime implements CurrentTime {
    @Override
    public Date getCurrentDate() {
        return new Date();
    }
}
