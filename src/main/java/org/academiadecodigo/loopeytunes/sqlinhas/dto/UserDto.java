package org.academiadecodigo.loopeytunes.sqlinhas.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDto {

    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;
    private String password;
    private Integer id;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
