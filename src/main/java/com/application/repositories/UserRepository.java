package com.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
