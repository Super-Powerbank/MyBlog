package com.tulun.ssm.pojo;

public class User {

        private Long id;
        private String name;
        private String passwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassswd() {
        return passwd;
    }

    public void setPassswd(String passswd) {
        this.passwd = passswd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
