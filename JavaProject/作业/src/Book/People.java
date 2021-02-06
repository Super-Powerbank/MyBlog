package Book;

public class People {
    private String id;//账号
    private String passwd;//密码

    public People(String id, String passwd) {
        this.id = id;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
