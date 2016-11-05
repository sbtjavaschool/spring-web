package ru.sbt.model;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<RocketPerson, Long> {
}
