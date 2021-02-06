package com.tulun.JDBC;

import java.sql.*;


class tbSchool {
    private final String jdbcDriver = "com.mysql.jdbc.Driver"; //jdbc 驱动
    private final String url = "jdbc:mysql://127.0.0.1:3306/school?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai";
    private final String userName = "root";
    private final String password = "123456";
    private Connection connection;  //连接对象
    private Statement statement;  //从connection获取到的statement
    //增删改查操作
//    private PreparedStatement preparedStatement;

    public tbSchool() {
        try {
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(url, userName, password);
            if (connection != null && !connection.isClosed()) {
                System.out.println("与mysql服务建立连接成功");
                statement = connection.createStatement();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectTest() {
        String sql = "select * from student where sid < 03";
        try {
            ResultSet resultSet = statement.executeQuery(sql);//
            //ResultSet 结果集
            while (resultSet.next()) {
                System.out.println("SID: " + resultSet.getString(1)
                        + "  Sname: " + resultSet.getString(2)
                        + "  Sage: " + resultSet.getString(3) +
                        "  Ssex: " + resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertTest(int id, String name, String password) {
//        String sql = "insert user values(id,name,password)";
        String sql = "insert user values(" + id + ",'" + name + "','"
                + password + "')";
        System.out.println("sql: " + sql);
        try {
            statement.executeUpdate(sql);
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
        tbSchool test = null;
        try {
            test = new tbSchool();
//        test.selectTest();
            test.insertTest(7, "Sam", "123456");
        } finally {
            if (test != null) {
                test.close();
            }
        }

    }

}
