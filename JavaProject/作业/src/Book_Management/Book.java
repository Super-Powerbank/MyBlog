package Book_Management;

public class Book {
    private String book_name;
    private String author;//作者
    private String publish;//出版社
    private double money;
    private boolean isBorrowed;//当前书是否被借走 false 没有借走

    public Book(String book_name, String author, String publish, double money) {
        this.book_name = book_name;
        this.author = author;
        this.publish = publish;
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
            return book_name.equals(((Book) obj).book_name);
        }
        return false;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
