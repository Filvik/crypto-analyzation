package com.example.crypto.analiziton.helper;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Calendar;

@Component
public class TimestampAdjuster {
    public static Timestamp addMillisecondsToTimestamp(Timestamp originalTimestamp, int milliseconds) {
        if (originalTimestamp == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(originalTimestamp.getTime());
        cal.add(Calendar.MILLISECOND, milliseconds);
        return new Timestamp(cal.getTimeInMillis());
    }
}

