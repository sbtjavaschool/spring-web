package ru.sbt.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface RocketRepository extends CrudRepository<Rocket, Long> {
    Rocket findByLaunchDate(Date date);
}
