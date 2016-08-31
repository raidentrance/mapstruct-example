package com.raidentrance;

import org.mapstruct.factory.Mappers;

import com.raidentrance.mapper.UserMapper;
import com.raidentrance.model.dto.UserDto;
import com.raidentrance.model.pojo.Role;
import com.raidentrance.model.pojo.User;

/**
 * @author raidentrance
 *
 */
public class MapStructSample {
	public static User buildUser() {
		Role r = new Role();
		r.setName("Admin");
		User user = new User();
		user.setUsername("raidentrance");
		user.setPassword("Super secret");
		user.setRole(r);
		return user;
	}

	public static void main(String[] args) {
		UserMapper instance = Mappers.getMapper(UserMapper.class);
		User user = buildUser();

		UserDto dto = instance.userToUserDto(user);
		System.out.println(dto.getUsername());
		System.out.println(dto.getPassword());
		System.out.println(dto.getRole().getName());
		System.out.println(dto.getRole().getClass());
	}
}
