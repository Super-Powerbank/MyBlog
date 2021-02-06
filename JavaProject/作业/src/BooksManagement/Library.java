package BooksManagement;

import java.util.Scanner;

public class Library {
    private Book[] book;//用于存放图书信息
    private Student[] students;//用于存放学生信息
    private int studentsize=0;//学生信息记录
    private int booksize=0;//图书的数量
    private static Scanner scanner = new Scanner(System.in);

    public Library(){
        this.students = new Student[10];
        book = new Book[10];
    }

    private void init(){ //初始化
        book[0]=new Book("西游记","吴承恩","三秦出版社",200);
        book[1]=new Book("红楼梦","曹雪芹","人民文学出版社",100);
        book[2]=new Book("三国演义","罗贯中","人民文学出版社",150);
        book[3]= new Book("水浒传","施耐庵","人民文学出版社",180);
        booksize=4;
        for (int i =booksize;i<book.length;i++){
            book[i]=new Book("暂无", "暂无","暂无",0);
        }
        for (int i=studentsize;i<students.length;i++){
            students[i]=new Student("暂无","暂无","暂无","暂无","暂无");
        }
    }

    public void start(){
        init();
        System.out.println("请选择您的身份： 1、学生  2、管理员  0、退出");
        int chioce = scanner.nextInt();
        if (chioce == 0) {
            return;
        }
        if (chioce == 1) {
            System.out.println("请选择登陆方式：1、手机号+密码  2、学号+密码");
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("请输入手机号：");
                String phonenumber = scanner.next();
                System.out.println("请输入密码：");
                String password = scanner.next();
                if (searchStudent(phonenumber, password)){
                    System.out.println("登陆成功!");
                    studentLogin();
                } else {
                    System.out.println("输入错误，请重新输入！");
                    return;
                }
            }
            if (n == 2) {
                System.out.println("请输入学号：");
                String id = scanner.next();
                System.out.println("请输入密码：");
                String password = scanner.next();
                if (searchStudent1(id, password)) {
                    System.out.println("登陆成功!");
                    studentLogin();
                } else {
                    System.out.println("输入错误，请重新输入！");
                    return;
                }
            }
        }
        if (chioce==2){
            System.out.println("请选择登陆方式：1、手机号+密码  2、职工号+密码");
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("请输入手机号：");
                String phonenumber = scanner.next();
                System.out.println("请输入密码：");
                String password = scanner.next();
                if (Manager.getPhonenumber().equals(phonenumber) && Manager.getPassword().equals(password)) {
                    System.out.println("登陆成功!");
                    managerLogin();
                } else {
                    System.out.println("输入错误，请重新输入！");
                    return;
                }
            }
            if (n == 2) {
                System.out.println("请输入职工号：");
                String id = scanner.next();
                System.out.println("请输入密码：");
                String password = scanner.next();
                if (Manager.getId().equals(id) && Manager.getPassword().equals(password)) {
                    System.out.println("登陆成功!");
                    managerLogin();
                } else {
                    System.out.println("输入错误，请重新输入！");
                    return;
                }
            }
        }
    }
    private void studentLogin(){
        while (true) {
            System.out.println("请选择以下功能：1、查询图书信息  2、借书  3、还书  4、修改密码  5、退出 6、返回");
            int choice = scanner.nextInt();
            if (choice==5){
                return;
            }
            if (choice == 1) {
                System.out.println("请输入需要查询的图书名称：");
                String bookname = scanner.next();
                for (int i = 0; i < booksize-1; i++) {
                    if (book[i].getBookname().equals(bookname)) {
                        System.out.println("书籍信息为：（书名-作者-价格-出版社-状态）");
                        System.out.println(book[i].getBookname() + "   "+book[i].getAuthor() + "   "+book[i].getMoney() + "   "+book[i].getPress() + "   "+book[i].isFalg());
                        break;
                    }
                    if (i==booksize){
                        System.out.println("没有找到该图书");
                        break;
                    }
                }
            }
            if (choice == 2) {
                System.out.println("请输入需要借阅的图书名称：");
                String bookname = scanner.next();
                for (int i = 0; i < booksize-1; i++) {
                    if (book[i].getBookname().equals(bookname)) {
                        book[i].setFalg(true);
                        System.out.println("借书成功");
                        break;
                    } else {
                        System.out.println("此书不存在");
                        break;
                    }
                }
            }
            if (choice == 3) {
                System.out.println("请输入需要归还的图书名称：");
                String bookname = scanner.next();
                for (int i = 0; i <booksize-1; i++) {
                    if (book[i].getBookname().equals(bookname)) {
                        book[i].setFalg(false);
                        System.out.println("还书成功");
                        break;
                    } else {
                        System.out.println("此书不存在");
                        break;
                    }
                }
            }
            if (choice == 4) {
                System.out.println("请输入学号或者手机号：");
                String account = scanner.next();
                System.out.println("输入新密码：");
                String newpassword = scanner.next();
                changePassword(account, newpassword);
                System.out.println("修改成功");
            }
            if (choice == 6){
                start();
            }
        }

    }
    private void managerLogin(){
        while (true) {
            System.out.println("请选择一下功能：1、查询图书信息  2、上架图书  3、下架图书  4、添加学生信息  5、删除学生信息 6、退出  7、返回");
            int choice = scanner.nextInt();
            if (choice == 6) {
                return;
            }
            if (choice == 1) {
                System.out.println("请输入需要查询的图书名称：");
                String bookname = scanner.next();
                for (int i = 0; i < booksize-1; i++) {
                    if (book[i].getBookname().equals(bookname)) {
                        System.out.println("书籍信息为：（书名-作者-价格-出版社-状态）");
                        System.out.println(book[i].getBookname() + "   "+book[i].getAuthor() + "   "+book[i].getMoney() + "   "+book[i].getPress() + "   "+book[i].isFalg());
                        break;
                    }
                    if (i==booksize){
                        System.out.println("没有找到该图书");
                    break;
                    }
                }
            }
            if (choice == 2){
                System.out.println("请输入书名：");
                String bookname = scanner.next();
                System.out.println("请输入作者：");
                String author = scanner.next();
                System.out.println("请输入出版社：");
                String press = scanner.next();
                System.out.println("请输入价格：");
                int money = scanner.nextInt();

                for (int i=0;i<book.length;i++){
                    if (book[i].getBookname().equals("暂无")){
                        book[i].setBookname(bookname);
                        book[i].setAuthor(author);
                        book[i].setPress(press);
                        book[i].setMoney(money);
                        book[i].setFalg(false);
                        booksize++;
                        System.out.println("添加成功！");
                        break;
                    }
                }
            }
            if (choice == 3){
                System.out.println("请输入需要下架的图书名称：");
                String bookname = scanner.next();
                for (int i=0;i<booksize-1;i++){
                    if (book[i].getBookname().equals(bookname)){
                        book[i].setBookname("暂无");
                        book[i].setAuthor("暂无");
                        book[i].setPress("暂无");
                        book[i].setMoney(0);
                        book[i].setFalg(true);
                        booksize--;
                        System.out.println("删除成功！");
                        break;
                    }
                }
            }
            if (choice == 4){
                System.out.println("请输入学生学号：");
                String id = scanner.next();
                System.out.println("请输入学生手机号：");
                String phonenumber = scanner.next();
                System.out.println("请输入学生姓名：");
                String name = scanner.next();
                System.out.println("请输入学生性别：");
                String sex = scanner.next();
                addStudent(id,phonenumber,name,sex,"tulun666");
                System.out.println("添加成功");
            }
            if (choice ==5){
                System.out.println("请输入删除学生学号或者手机号：");
                String account = scanner.next();
                deleteStudent(account);
                System.out.println("删除成功");
            }
            if (choice == 7){
                start();
            }
        }

    }
    //学生手机号登录方法
    private boolean searchStudent(String phonenumber,String password) {
        for (int i = 0; i <studentsize; i++) {
            if (phonenumber.equals(students[i].getPhonenumber()) && password.equals(students[i].getPassword())) {
                return true;
            }
        }
        return false;
    }

    //学生学号登录方法
    private boolean searchStudent1(String id,String password) {
        for (int i = 0; i < studentsize; i++) {
            if (id.equals(students[i].getId()) && password.equals(students[i].getPassword())) {
                return true;
            }
        }
        return false;
    }

//    //管理员手机号登录方法
//    private boolean searchManager(String phonenumber,String password) {
//        for (int i = 0; i <managerssize; i++) {
//            if (phonenumber.equals(managers[i].getPhonenumber()) && password.equals(managers[i].getPassword())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //管理员职工号登录方法
//    private boolean searchManager1(String id,String password) {
//        for (int i = 0; i < managerssize; i++) {
//            if (id.equals(managers[i].getId()) && password.equals(managers[i].getPassword())) {
//                return true;
//            }
//        }
//        return false;
//    }

    //改密码方法
    private void changePassword(String account,String newpassword){
        for (int i=0;i<studentsize-1;i++){
            if (account.equals(students[i].getPhonenumber()) && newpassword.equals(students[i].getPassword())){
                students[i].setPassword(newpassword);
            }
            if (account.equals(students[i].getId()) && newpassword.equals(students[i].getPassword())){
                students[i].setPassword(newpassword);
            }
        }
    }

    //添加学生信息方法
    private void addStudent(String id,String phonenumber,String name,String sex,String password){
        for (int i=0;i<students.length;i++){
            if (students[i].getId()==null){
                students[i].setId(id);
                students[i].setPhonenumber(phonenumber);
                students[i].setName(name);
                students[i].setSex(sex);
                students[i].setPassword(password);
                studentsize++;
                break;
            }
        }
    }

    //删除学生信息方法
    private void deleteStudent(String account){
        for (int i=0;i<studentsize-1;i++){
            if (account.equals(students[i].getPhonenumber())||account.equals(students[i].getId())){
                students[i] = null;
                studentsize--;
                break;
            }
        }
    }
}
