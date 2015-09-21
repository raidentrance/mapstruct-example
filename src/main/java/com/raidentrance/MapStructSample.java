package com.raidentrance;

import org.mapstruct.factory.Mappers;

import com.raidentrance.mapper.UserMapper;
import com.raidentrance.model.Role;
import com.raidentrance.model.User;
import com.raidentrance.model.UserDto;

/**
 * @author raidentrance
 *
 */
public class MapStructSample {
	public static User buildUser() {
		Role r = new Role();
		r.setName("Admin");
		User user = new User();
		user.setUsername("Alex");
		user.setPassword("Raidentrance123");
		user.setRole(r);
		return user;
	}

	public static void main(String[] args) {
		UserMapper instance = Mappers.getMapper(UserMapper.class);
		User user = buildUser();

		UserDto dto = instance.userToUserDto(user);
		System.out.println(dto.getUsername());
		System.out.println(dto.getRole().getClass());
	}
}
