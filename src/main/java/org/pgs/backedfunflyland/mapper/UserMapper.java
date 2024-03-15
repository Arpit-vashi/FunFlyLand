package org.pgs.backedfunflyland.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.backedfunflyland.dto.UserDto;
import org.pgs.backedfunflyland.model.UserModel;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "role", target = "role")
    })
    UserDto userToUserDto(UserModel userModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "mobileNumber", target = "mobileNumber"),
            @Mapping(source = "role", target = "role")
    })
    UserModel userDtoToUser(UserDto userDto);
}
