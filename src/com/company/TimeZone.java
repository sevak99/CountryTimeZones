package com.company;

import java.util.Comparator;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class TimeZone {
    private int id;
    private String conutryCode;
    private String timeZone;

    public TimeZone(int id, String conutryCode, String timeZone) {
        this.id = id;
        this.conutryCode = conutryCode;
        this.timeZone = timeZone;
    }

    public String getConutryCode() {
        return conutryCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(". ")
                .append(conutryCode).append(", ")
                .append(timeZone);
        return builder.toString();
    }
}
