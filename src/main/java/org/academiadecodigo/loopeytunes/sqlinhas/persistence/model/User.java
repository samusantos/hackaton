package org.academiadecodigo.loopeytunes.sqlinhas.persistence.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;



    private Date lastDrink;

    @Version
    private Integer version;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
