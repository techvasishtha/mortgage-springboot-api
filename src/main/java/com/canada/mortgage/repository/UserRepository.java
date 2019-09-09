package com.canada.mortgage.repository;

import com.canada.mortgage.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  UserRepository extends CrudRepository<User, Long> {

    List<User> findByEmailAddress(String emailAddress);


}
