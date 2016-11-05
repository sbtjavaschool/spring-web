package ru.sbt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbt.model.*;

import java.util.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

@RestController
@RequestMapping("/rocket")
public class RocketController {
    @Autowired
    private RocketRepository rocketRepository;
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(params = "action=create")
    public long create(Rocket rocket) {
        return rocketRepository.save(rocket).getId();
    }

    @RequestMapping(params = "action=all")
    public Iterable<Rocket> findAll() {
        return rocketRepository.findAll();
    }

    @RequestMapping(params = "action=byDate")
    public Rocket find(@DateTimeFormat(iso = DATE) Date date) {
        return rocketRepository.findByLaunchDate(date);
    }

    @RequestMapping(params = "action=person")
    public Iterable<RocketPerson> find() {
        Iterable<RocketPerson> all = personRepository.findAll();
        RocketPerson next = all.iterator().next();
        return all;
    }

    @RequestMapping(params = "action=savePerson")
    public long save(String name, @DateTimeFormat(iso = DATE) Date launchDate) {
        RocketPerson person = new RocketPerson();
        Rocket rocket = new Rocket();
        rocket.setName(name);
        rocket.setLaunchDate(launchDate);
        person.setRocket(rocket);
        return personRepository.save(person).getId();
    }

}