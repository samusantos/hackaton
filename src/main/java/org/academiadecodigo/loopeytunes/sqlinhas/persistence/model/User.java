package org.academiadecodigo.loopeytunes.sqlinhas.persistence.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String email;

    private Integer id;
    private String password;
    private Date lastDrink;

    @Transient
    private String message;

    @Version
    private Integer version;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getLastDrink() {
        return lastDrink;
    }

    public void setLastDrink(Date lastDrink) {
        this.lastDrink = lastDrink;
    }
}

