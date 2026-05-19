package org.sebsy.grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    private Util(){}

    /**
     * Transforme une date au format String en {@link LocalDateTime}
     *
     * @param dateStr date au format String
     * @return LocalDateTime
     */
    public static LocalDateTime toDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(dateStr, formatter);
    }
}
