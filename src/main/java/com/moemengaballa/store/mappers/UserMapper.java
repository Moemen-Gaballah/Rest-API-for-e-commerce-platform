package com.moemengaballa.store.mappers;

import com.moemengaballa.store.dtos.RegisterUserRequest;
import com.moemengaballa.store.dtos.UpdateUserRequest;
import com.moemengaballa.store.dtos.UserDto;
import com.moemengaballa.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
