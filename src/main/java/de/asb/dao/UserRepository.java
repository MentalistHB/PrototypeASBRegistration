package de.asb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.asb.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
