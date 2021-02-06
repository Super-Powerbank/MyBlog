package Book_Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Student> stu_arr;
    private ArrayList<Book> book_arr;
    private ArrayList<Manager> manager_arr;
    private static Scanner scanner = new Scanner(System.in);

    public Library(){
        stu_arr = new ArrayList<>();
        book_arr = new ArrayList<>();
        manager_arr = new ArrayList<>();
    }
    /**
     * 根据people对象类型，在相对的数组中进行元素查找，找到返回元素对象，没有返回null
     * @param people
     * @param id
     * @param passwd
     * @return
     */
    private People search(People people,String id,String passwd){
        int index = -1;
        if(people instanceof Student){
            //ArrayList类 index = indexOf (Object o);
            Student student = (Student)people;
            index = stu_arr.indexOf(student);//[i].equals(student);
            if(index >= 0) {
                return stu_arr.get(index);//将当前inde所在元素下标进行返回
            }
        }else if(people instanceof Manager){
            Manager manager = (Manager)people;
            index = manager_arr.indexOf(manager);
            if(index >= 0) {
                return manager_arr.get(index);//将当前inde所在元素下标进行返回
            }
        }
        return null;
    }


    private void addStudent(){
        System.out.println("请输入注册学生信息: 学生姓名 , 学生账号 ,学生密码:");
        Student student = new Student(scanner.next(),scanner.next(),scanner.next());
        //如果存在之前注册过，此时添加学生信息失败
        boolean result = stu_arr.contains(student);
        if (result){
            System.out.println("注册学生信息失败");
        }else {
            stu_arr.add(student);
            System.out.println("添加学生信息成功");
        }
    }

    private void removeStudent(){
        System.out.println("请输入删除学生信息: 学生姓名 , 学生账号 ,学生密码:");
        Student student = new Student(scanner.next(),scanner.next(),scanner.next());
        stu_arr.remove(student);
    }
    private void addBook(){
        System.out.println("请输入归还/上架书籍的信息：书名，作者，出版社，价格");
        String bookname = scanner.next();
        String author = scanner.next();
        String publish = scanner.next();
        double money = scanner.nextDouble();
        Book book = new Book(bookname,author,publish,money);
        book_arr.add(book);//归还书籍
        System.out.println("还书/上架成功");
    }
    /**
     * 还书
     * 思路：
     *    根据书名book_arr中查找书名相同的书籍保存在books数组中。
     *    如果查找的书存在多本，此时需要打印这些书籍信息，选择借阅第几本书，将该书信息从book_arr中删除
     *    如果查找的书存在一本，直接从book_arr中删除
     *    如果没有找到，打印没有找到信息提示
     */
    private void removeBook(){
        System.out.print("输入书名：");
        String book_name = scanner.next();  //如果该书名有多种版本的书籍，请选择借阅第几本，如果没有多个，此时直接借阅
        Book[] books = searchBookByBookName(book_name);//找到后将书籍信息展示
        for (int i = 0; i < books.length; i++) {//遍历book_arr 底层数组
            Book currentBook = books[i];
            if (currentBook != null && currentBook.getBook_name().equals(book_name)) {
                System.out.println("第" + (i + 1) + "本书  " + "  书名: " + currentBook.getBook_name() + "  作者：" + currentBook.getAuthor() +
                        "  价格: " + currentBook.getMoney() + "  出版社: " + currentBook.getPublish());
            }
        }
        System.out.println("请选择借阅/下架第几本书");
        int n = scanner.nextInt();
        while (n <= 0 && n > books.length) {
            System.out.println("序号输入错误，请重新输入");
            n = scanner.nextInt();
        }
        int index = book_arr.indexOf(books[n-1]);//找到books数组中第n本图书，将其从book_arr对应的数组删除掉
        book_arr.remove(index);//n是个数，在这里通过下标操作remove
        System.out.println("借阅/下架成功");
    }

    //修改图书信息
    private void changeBook(){
        System.out.print("输入书名：");
        String book_name = scanner.next();  //如果该书名有多种版本的书籍，请选择修改第几本，如果没有多个，此时直接修改
        Book[] books = searchBookByBookName(book_name);//找到后将书籍信息展示
        for (int i = 0; i < books.length; i++) {//遍历book_arr 底层数组
            Book currentBook = books[i];
            if (currentBook != null && currentBook.getBook_name().equals(book_name)) {
                System.out.println("第" + (i + 1) + "本书  " + "  书名: " + currentBook.getBook_name() + "  作者：" + currentBook.getAuthor() +
                        "  价格: " + currentBook.getMoney() + "  出版社: " + currentBook.getPublish());
            }
        }
        System.out.println("请选择修改第几本书");
        int n = scanner.nextInt();
        while (n <= 0 && n > books.length) {
            System.out.println("序号输入错误，请重新输入");
            n = scanner.nextInt();
        }
        int index = book_arr.indexOf(books[n-1]);
        System.out.println("请输入修改后的图书信息：书名，作者，出版社，价格");
        String bookname = scanner.next();
        String author = scanner.next();
        String publish = scanner.next();
        double money = scanner.nextDouble();
        Book book = new Book(bookname,author,publish,money);
        book_arr.add(index,book);
        System.out.println("修改成功");

    }


    /**
     * 根据书名进行书籍信息展示
     */
    private void bookMassage(){
        System.out.print("输入查询书名：");
        String book_name = scanner.next();
        Book[] books = searchBookByBookName(book_name);
        for(int i=0;i<books.length;i++){//遍历book_arr 底层数组
            Book currentBook = books[i];
            if(currentBook!=null && currentBook.getBook_name().equals(book_name)){
                System.out.println("书名: "+currentBook.getBook_name()+"  作者："+currentBook.getAuthor()+
                        "  价格: "+currentBook.getMoney()+"  出版社: "+currentBook.getPublish());
            }
        }
    }

    private Book[] searchBookByBookName(String bookName){
        //将相同名称的书籍返回  Book数组
        Book[] sameBookNameArr = new Book[book_arr.size()];//开辟数组大小最大可以是存储图书的个数
        int j = 0;//用来控制sameBookName数组个数
        for(int i=0;i<book_arr.size();i++){//遍历book_arr 底层数组
            Book currentBook = book_arr.get(i);
            if(currentBook!=null && currentBook.getBook_name().equals(bookName)){
                sameBookNameArr[j++] = currentBook;
            }
        }
        return sameBookNameArr;
    }
    /*
      管理员登录成功界面
     */
    private void loginSuccessManager(){
        while (true) {
            System.out.println("============");
            System.out.println("1. 上架图书");
            System.out.println("2. 下架图书");
            System.out.println("3. 查询图书信息");
            System.out.println("4. 修改图书信息");
            System.out.println("5. 添加学生信息");
            System.out.println("6. 删除学生信息");
            System.out.println("7. 退出登录");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            switch (chioce) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    bookMassage();
                    break;
                case 4:
                    changeBook();
                    break;
                case 5:
                    addStudent();
                    break;
                case 6:
                    removeStudent();
                case 7:
                    return;
            }
        }
    }

    /**
     * 学生登陆成功界面
     */
    private void loginSuccessStudent(){
        while (true) {
            System.out.println("============");
            System.out.println("1. 根据书名检索图书信息");
            System.out.println("2. 借阅图书");
            System.out.println("3. 归还图书");
            System.out.println("4. 退出登录");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            if (chioce == 4) {
                return;
            }
            switch (chioce) {
                case 1:
                    bookMassage();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    addBook();
                    break;
            }
        }
    }
    /**
     * 登录操作，无论学生身份，管理员身份，此时返回People类型，调用处通过instanceof进行区别
     * @param pricepleName
     * @return
     */
    private People login(String pricepleName){
        System.out.println("请输入账号，密码");
        String  id= scanner.next();
        String passwd = scanner.next();
        People people = null;
        if(pricepleName.equals("管理员")){
            //当前类操作的就是管理员
            people = search(new Manager(id,passwd),id,passwd);
        }else if(pricepleName.equals("学生")){
            System.out.println("输入登录学姓名");
            people = search(new Student(scanner.next(),id,passwd),id,passwd);
        }
        return people;
    }

    /**
     * g管理员身份
     */
    private void managerPriceple(){
        Manager manager = null;
        while (true) {
            System.out.println("============");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            switch (chioce) {
                case 1:
                    People people = login("管理员");
                    if (people == null) {
                        System.out.println("登录失败");
                    } else {
                        System.out.println("登录成功");
                        loginSuccessManager();
                    }
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * 管理员注册
     */
    private void register(){
        System.out.println("输入管理员注册信息：账号，密码");
        Manager manager = new Manager(scanner.next(),scanner.next());
        //如果之前注册过，此时注册失败（查找）
        boolean result = manager_arr.contains(manager);
        if(result) {
            System.out.println("存在用户，注册失败");
        }else{
            manager_arr.add(manager);
            System.out.println("注册用户成功");
        }
    }

    /**
     * 学生身份
     */
    private void stuPriceple(){
        People people = null;
        while (true) {
            System.out.println("============");
            System.out.println("1 登录 2 退出");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            if (chioce == 1) {
                people = login("学生");
            }else{
                return;
            }
            if (people == null) {
                System.out.println("登录失败");
            } else {
                System.out.println("登录成功");
                loginSuccessStudent();
            }
        }
    }

    public void start(){
        while (true) {
            System.out.println("============");
            System.out.println("1.学生身份 2. 管理员身份 3 退出");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = 0;
            try {
                chioce = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("非法输入");
            }
            switch (chioce) {
                case 1:
                    stuPriceple();
                    break;
                case 2:
                    managerPriceple();
                    break;
                case 3:
                    return;
            }
        }
    }
}
