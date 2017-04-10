package com.company;

import java.util.Comparator;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class Country {
    private static int n = 1;
    private int id;
    private String countryCode;
    private String englishName;
    private String franchName;
    private TimeZone timeZone;

    public Country(String countryCode, String englishName, String franchName) {
        id = n++;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.franchName = franchName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(", ")
                .append(countryCode).append(", ")
                .append(englishName).append(", ");
        if(timeZone == null) builder.append("Not Time Zone");
        else builder.append(timeZone.getTimeZone());

        return builder.toString();
    }
}
