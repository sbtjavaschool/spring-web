package ru.sbt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
public class Rocket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Temporal(value = DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date launchDate;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }
}
