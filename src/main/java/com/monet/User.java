package com.monet;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private String mPassword;
    private Date bir;
    private int phone;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", bir=" + bir +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (username == null) {
            if (user.username != null) {
                return false;
            }
        } else if (!username.equals(user.username)) {
            return false;
        }
        return true;

    }


    public User() {
    }

    public User(String username, String password, String mPassword, Date bir, int phone, String email) {
        this.username = username;
        this.password = password;
        this.mPassword = mPassword;
        this.bir = bir;
        this.phone = phone;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
