package com.pizza.Pizzabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.Pizzabackend.model.*;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
