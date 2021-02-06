package com.tulun.JDBC;

import java.sql.*;

public class Test1 {
    private final String jdbcDriver = "com.mysql.jdbc.Driver"; //jdbc 驱动
    private final String url = "jdbc:mysql://127.0.0.1:3306/school?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai";
    private final String userName = "root";
    private final String password = "123456";
    private Connection connection;  //连接对象
    private PreparedStatement pre;
    private PreparedStatement pre1;

    public Test1() {
        try {
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(url, userName, password);
            if (connection != null && !connection.isClosed()) {
                System.out.println("与mysql服务建立连接成功");
                connection.setAutoCommit(false);
                connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tranTest(){
        String sql = "update ac_a set money = money + ? where id = ?";
        String sql1 = "update ac_b set money = money - ? where id=?";
        Savepoint p1 = null;

        try {
            pre = connection.prepareStatement(sql);
            pre1 =connection.prepareStatement(sql1);
            pre.setInt(1,50);
            pre.setInt(2,1);
            pre1.setInt(1,50);
            pre1.setInt(2,2);
            pre.executeUpdate();
            pre1.executeUpdate();
            connection.commit();;
        } catch (Exception e) {
            System.out.println("rollback 触发");
            if (p1!=null){
                try {
                    connection.rollback(p1);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }

    }
    public PreparedStatement createInserSQL(){
        String sql = "insert user values(?,?,?)";
        try {
            pre = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pre;
    }

    //    String sql = "insert user values(" + id + ",'" + name + "','"
//            + password + "')";
//        System.out.println("sql: " + sql);
//        try {
//        statement.executeUpdate(sql);
    public void insertTest(PreparedStatement pre,int id, String name, String password) {
        //占位符  ？
        try {
            //参数传递mysql
            pre.setInt(1, id);
            pre.setString(2, name);
            pre.setString(3, password);
            pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test1 test1 = null;
        try {
            test1 = new Test1();
            PreparedStatement pre = test1.createInserSQL();
            test1.insertTest(pre,8, "李四", "123456");
            test1.insertTest(pre,9, "王五", "123456");
            test1.insertTest(pre,10, "marry", "123456");


        }finally {
            if (test1 != null) {
                test1.close();
            }
        }
    }
}
