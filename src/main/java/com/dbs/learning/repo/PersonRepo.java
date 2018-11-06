package com.dbs.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.learning.pojo.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
