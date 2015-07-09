package com.raidentrance.mapper;

import org.mapstruct.Mapper;

import com.raidentrance.model.Role;
import com.raidentrance.model.RoleDto;
import com.raidentrance.model.User;
import com.raidentrance.model.UserDto;

@Mapper
public interface UserMapper {

	UserDto userToUserDto(User user);

	RoleDto roleToRoleDto(Role user);

}
