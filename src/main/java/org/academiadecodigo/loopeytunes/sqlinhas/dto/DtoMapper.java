package org.academiadecodigo.loopeytunes.sqlinhas.dto;

import org.academiadecodigo.loopeytunes.sqlinhas.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class DtoMapper {

    public User dtoToUser(UserDto dto){
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return user;
    }
}
