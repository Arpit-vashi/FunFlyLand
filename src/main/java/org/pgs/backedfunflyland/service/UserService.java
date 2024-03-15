package org.pgs.backedfunflyland.service;

import org.pgs.backedfunflyland.dto.UserDto;
import org.pgs.backedfunflyland.model.UserModel;
import org.pgs.backedfunflyland.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public UserDto getUserById(Long id) {
        UserModel userModel = userRepository.findById(id).orElse(null);
        return convertToDto(userModel);
    }

    public UserDto createUser(UserDto userDto) {
        UserModel userModel = convertToEntity(userDto);
        userModel = userRepository.save(userModel);
        return convertToDto(userModel);
    }

    public UserDto updateUser(Long id, UserDto userDto) {
        UserModel userModel = convertToEntity(userDto);
        userModel.setId(id); // Set ID from path variable
        userModel = userRepository.save(userModel);
        return convertToDto(userModel);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Helper method to convert UserDto to UserModel
    private UserModel convertToEntity(UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setId(userDto.getId());
        userModel.setUsername(userDto.getUsername());
        userModel.setPassword(userDto.getPassword());
        userModel.setSalary(userDto.getSalary());
        userModel.setEmail(userDto.getEmail());
        userModel.setMobileNumber(userDto.getMobileNumber());
        userModel.setRole(userDto.getRole());
        return userModel;
    }

    // Helper method to convert UserModel to UserDto
    private UserDto convertToDto(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(userModel.getId());
        userDto.setUsername(userModel.getUsername());
        userDto.setPassword(userModel.getPassword());
        userDto.setSalary(userModel.getSalary());
        userDto.setEmail(userModel.getEmail());
        userDto.setMobileNumber(userModel.getMobileNumber());
        userDto.setRole(userModel.getRole());
        return userDto;
    }
}
