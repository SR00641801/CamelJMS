package com.example.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
	}

	public List<User> findAll() {
		return users;

	}

	public User save(User user) {
		users.add(user);
		return user;

	}

	public User findOne(Integer id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;

	}

	public User deleteOne(Integer id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;

	}

}
