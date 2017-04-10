package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File countriesFile = new File("countries.csv");
        File timeZonesFile = new File("zone.csv");
        File file = new File("out.csv");

        CountryTimeZones countryTimeZones = new CountryTimeZones(countriesFile, timeZonesFile);
        countryTimeZones.print(file);

    }
}
