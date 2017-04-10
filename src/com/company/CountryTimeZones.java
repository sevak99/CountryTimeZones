package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class CountryTimeZones {
    private ArrayList<Country> countries;
    private ArrayList<TimeZone> timeZones;

    public CountryTimeZones(File countriesFile, File timeZonesFile) throws IOException {
        countries = new ArrayList<>();
        timeZones = new ArrayList<>();

        setCountries(countriesFile);
        setTimeZones(timeZonesFile);

        setTimeZoneToCountry();
    }

    private void setCountries(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String string;
        while ((string = reader.readLine()) != null) {
            String[] str = string.split(",");
            countries.add(new Country(str[0], str[1], str[2]));
        }
    }

    private void setTimeZones(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String string;
        while ((string = reader.readLine()) != null) {
            String[] str = string.split(",");
            for(int i = 0; i < str.length ; i++) {
                str[i] = str[i].substring(1, str[i].length() - 1);
            }
            timeZones.add(new TimeZone(Integer.parseInt(str[0]), str[1], str[2]));
        }
    }

    private void setTimeZoneToCountry() {
        for (int i = 0; i < countries.size(); i++) {
            for (int j = 0; j < timeZones.size(); j++) {
                if(countries.get(i).getCountryCode().equals(timeZones.get(j).getConutryCode())) {
                    countries.get(i).setTimeZone(timeZones.get(j));
                    break;
                }
            }
        }
    }

    public void print(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < countries.size(); i++) {
            writer.write(countries.get(i).toString());
            writer.newLine();
            System.out.println(countries.get(i).toString());
        }
    }

}
