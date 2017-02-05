package de.asb.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.asb.dao.UserRepository;
import de.asb.entities.User;

@RestController
public class UserRestService {
	private UserRepository userRepository;
	
	@RequestMapping(value="/addUser")
	@Secured(value={"ROLE_ADMIN", "ROLE_SCOLARITE"})
	public User addUser(User u){
		return userRepository.save(u);
		
	}
}
