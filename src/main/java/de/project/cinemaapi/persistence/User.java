package de.project.cinemaapi.persistence;

import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;

@Entity
public class User {

    private static int id = 0;

    @Id
    private int userId;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private boolean isAdmin;

    public User(String userName, String password, boolean isAdmin) {
        this.userId = id;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
        id++;
    }

    public User(int userId, String userName, String password, boolean isAdmin) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User() {
        id++;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
