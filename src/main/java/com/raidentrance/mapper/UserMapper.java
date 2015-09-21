package com.raidentrance.mapper;

import org.mapstruct.Mapper;

import com.raidentrance.model.dto.RoleDto;
import com.raidentrance.model.dto.UserDto;
import com.raidentrance.model.pojo.Role;
import com.raidentrance.model.pojo.User;

/**
 * @author raidentrance
 *
 */
@Mapper
public interface UserMapper {

	UserDto userToUserDto(User user);

	RoleDto roleToRoleDto(Role user);

}
