package com.pinku.spring.modules.api;

import com.pinku.spring.modules.api.entity.User;
import com.pinku.spring.modules.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringModulesApiApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101, "user1", "pass1", "user1.pass1@gmail.com"),
				new User(102, "user2", "pass2", "user2.pass2@gmail.com")
		).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringModulesApiApplication.class, args);
	}

}
