package ru.bogdanov.bsecuritythemeelaf2d.service;

import ru.bogdanov.bsecuritythemeelaf2d.dto.UserDto;
import ru.bogdanov.bsecuritythemeelaf2d.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}