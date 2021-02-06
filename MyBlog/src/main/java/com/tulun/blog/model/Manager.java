package com.tulun.blog.model;

public class Manager {
    //用户id
    private Long id;
    //用户名
    private String userName;
    //密码
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
