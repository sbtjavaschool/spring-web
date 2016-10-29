package ru.sbt;

import java.util.Date;

public class UserPage {
    private final String name;
    private final String city;
    private final Date date;

    public UserPage(String name, String city, Date date) {
        this.name = name;
        this.city = city;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Date getDate() {
        return date;
    }
}
