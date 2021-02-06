package Book;

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
    //复用这个方法  根据id,passwd找对应的人
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
    private Student stuPriceple(){
        Student student = null;
        System.out.println("============");
        System.out.println("1 登录");
        System.out.println("============");
        System.out.println("请输入您的选择: ");
        int chioce = scanner.nextInt();
        if(chioce == 1){
            System.out.println("请输入账号，密码");
            String  id= scanner.next();
            String passwd = scanner.next();
            People people = search(new Student(id,passwd),id,passwd);
            //当前类操作的就是学生
            if(people instanceof Student){
                student = (Student)people;
            }
        }
        return student;
    }
    private Manager managerPriceple(){
        Manager manager = null;
        System.out.println("============");
        System.out.println("1 登录");
        System.out.println("2 注册");
        System.out.println("============");
        System.out.println("请输入您的选择: ");
        int chioce = scanner.nextInt();
        if(chioce == 1){
            System.out.println("请输入账号，密码");
            String  id= scanner.next();
            String passwd = scanner.next();
            People people = search(new Manager(id,passwd),id,passwd);
            //当前类操作的就是管理员
            if(people instanceof Manager){
                manager = (Manager) people;
            }
        }
        if (chioce ==2){
            System.out.println("请输入账号");
            String  id= scanner.next();
            System.out.println("请输入密码");
            String passwd = scanner.next();
//            Manager manager1 = new Manager(id,passwd);
            manager_arr.add(new Manager(id,passwd));
            System.out.println("注册成功");
            return manager_arr.get(0);
        }
        return manager;
    }
    private boolean serch(String book_name){
        for (int i=0;i<book_arr.size();i++){
            if (book_name.equals(book_arr.get(i).getBook_name())){
                 return false;//有一样的
            }
        }
        return true;//没一样的
    }
    private void loginSuccessOfmanager(){
        while (true) {
            System.out.println("============");
            System.out.println("1. 查找图书");
            System.out.println("2. 上架图书");
            System.out.println("3. 下架图书");
            System.out.println("4. 添加学生信息");
            System.out.println("5. 删除学生信息");
            System.out.println("6. 退出登录");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            if (chioce == 6) {
                return;
            }
            switch (chioce) {
                case 1:
                    System.out.println("输入查询的书名：");
                    String book_name = scanner.next();
                    boolean flag = serch(book_name);
                    if (flag==false) {
                        for (int i = 0; i < book_arr.size(); i++) {
                            if (book_name.equals(book_arr.get(i).getBook_name())) {
                                System.out.println(book_arr.get(i).getBook_name() + "--" + book_arr.get(i).getAuthor() + "--" + book_arr.get(i).getPublish() + "--" + book_arr.get(i).getMoney() + "--" + book_arr.get(i).isBorrowed());
                            }
                        }
                    } else {
                        System.out.println("抱歉，没找到");
                    }
                    break;
                case 2:
                    System.out.println("请输入书名");
                    String book_name2 = scanner.next();
                    boolean flag1 = serch(book_name2);
                    if (flag1) {
                        System.out.println("请输入作者");
                        String author = scanner.next();
                        System.out.println("请输入出版社");
                        String publish = scanner.next();
                        System.out.println("请输入价格");
                        double money = scanner.nextDouble();
                        book_arr.add(new Book(book_name2, author, publish, money));
                        System.out.println("上架成功");
                    }//增加书籍
                    else {
                        System.out.println("图书已存在");
                    }
                    break;
                case 3:
                    System.out.println("请输入书名");
                    String book_name3 = scanner.next();
                    boolean flag2 = serch(book_name3);
                    if (flag2) {
                        System.out.println("图书不存在");
                    } else {
                        for (int i = 0; i < book_arr.size(); i++) {
                            if (book_name3.equals(book_arr.get(i).getBook_name())) {
                                book_arr.remove(i);
                                System.out.println("下架成功");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("请输入账号");
                    String id = scanner.next();
                    System.out.println("请输入密码");
                    String passwd = scanner.next();
//                Student student = new Student(id,passwd);
                    stu_arr.add(new Student(id, passwd));
                    System.out.println("添加成功");
                    break;
                case 5:
                    System.out.println("请输入删除学生账号");
                    String id1 = scanner.next();
                    for (int i = 0; i < stu_arr.size(); i++) {
                        if (id1.equals(stu_arr.get(i).getStu_id())) {
                            stu_arr.remove(i);
                            System.out.println("删除成功");
                        }
                    }
                    break;
            }
        }
    }

    private void loginSuccessOfstudent() {//Student登录成功
        while (true) {
            System.out.println("============");
            System.out.println("1. 查找图书");
            System.out.println("2. 借阅图书");
            System.out.println("3. 归还图书");
            System.out.println("4. 修改密码");
            System.out.println("5. 退出登录");
            System.out.println("============");
            System.out.println("请输入您的选择: ");
            int chioce = scanner.nextInt();
            if (chioce == 5) {
                return;
            }
            switch (chioce) {
                case 1:
                    System.out.println("输入查询的书名：");
                    String book_name = scanner.next();
                    boolean flag = serch(book_name);
                    if (flag) {
                        for (int i = 0; i < book_arr.size(); i++) {
                            if (book_name.equals(book_arr.get(i).getBook_name())) {
                                System.out.println(book_arr.get(i).getBook_name() + "--" + book_arr.get(i).getAuthor() + "--" + book_arr.get(i).getPublish() + "--" + book_arr.get(i).getMoney() + "--" + book_arr.get(i).isBorrowed());
                            }
                        }
                    } else {
                        System.out.println("抱歉，没找到");
                    }
                    break;
                case 2:
                    System.out.println("输入借阅的书名");
                    String book_name1 = scanner.next();
                    for (int i = 0; i > book_arr.size(); i++) {
                        if (book_name1.equals(book_arr.get(i).getBook_name())) {
                            book_arr.get(i).setBorrowed(true);
                            System.out.println("借阅成功");
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入归还的书名");
                    String book_name2 = scanner.next();
                    for (int i = 0; i > book_arr.size(); i++) {
                        if (book_name2.equals(book_arr.get(i).getBook_name())) {
                            System.out.println("图书已存在");
                        } else {
                            book_arr.get(i).setBorrowed(false);
                            System.out.println("归还成功");
                        }
                    }
                    break;
                case 4:
                    System.out.println("请输入修改密码的账号");
                    String id2 = scanner.next();
                    System.out.println("请输入原密码");
                    String password = scanner.next();
                    System.out.println("输入新密码");
                    String newPassword = scanner.next();
                    for (int i = 0; i < stu_arr.size(); i++) {
                        if (id2.equals(stu_arr.get(i).getId()) && password.equals(stu_arr.get(i).getPasswd())) {
                            stu_arr.get(i).setPasswd(newPassword);
                        }
                    }
                    break;
            }
        }
    }

    public void start(){
        System.out.println("============");
        System.out.println("1.学生身份 2. 管理员身份");
        System.out.println("============");
        System.out.println("请输入您的选择: ");
        int chioce = 0;
        try {
            chioce = scanner.nextInt();
        }catch (Exception e){
            System.out.println("非法输入");
        }
        switch (chioce){
            case 1:
                Student student = stuPriceple();
                if(student != null){//登录成功
                    loginSuccessOfstudent();
                }else{
                    System.out.println("登录失败");
                }
                break;
            case 2:
                Manager manager = managerPriceple();
                if (manager!=null){
                    loginSuccessOfmanager();
                }else {
                    System.out.println("登陆失败");
                }
                break;
        }


    }
}