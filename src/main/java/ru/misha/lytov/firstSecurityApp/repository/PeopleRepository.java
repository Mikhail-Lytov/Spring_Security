package ru.misha.lytov.firstSecurityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.parameters.P;
import ru.misha.lytov.firstSecurityApp.models.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
