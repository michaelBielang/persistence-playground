package codemerger.transactional.hib.repository;

import codemerger.transactional.hib.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Organisation: Codemerger Ldt.
 * Project: sequence
 * Package: codemerger.transactional.hib.repository
 * Date: 13.12.2020
 *

 * @version: java version "14" 2020-03-17
 */

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    @Override
    List<Person> findAll();
}

