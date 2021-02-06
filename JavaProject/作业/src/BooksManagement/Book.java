package BooksManagement;

public class Book {
    private String bookname;//书名
    private String author;//作者
    private String press;//出版社
    private int money; //价格
    private boolean falg;//是否借出 ture已借出 false未借出

    public Book(String bookname, String author, String press, int money) {
        this.bookname = bookname;
        this.author = author;
        this.press = press;
        this.money = money;
        this.falg=false;
    }
    public void show(){
        System.out.println(bookname+" "+author+"  "+press+"  "+money+"  "+falg);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }
}
