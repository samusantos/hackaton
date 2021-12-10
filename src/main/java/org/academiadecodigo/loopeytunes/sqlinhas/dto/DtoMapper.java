package org.academiadecodigo.loopeytunes.sqlinhas.dto;

import org.academiadecodigo.loopeytunes.sqlinhas.persistence.model.User;

public class DtoMapper {

    public User dtoToUser(UserDto dto){
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setId(dto.getId());
        user.setMessage(dto.getMessage());

        return user;
    }
}
