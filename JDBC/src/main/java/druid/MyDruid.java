package druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class MyDruid {
    private DataSource dataSource;

    private MyDruid() {
        Properties pro = new Properties();
        dataSource = new DruidDataSource();
        FileInputStream is = null;//方式 二
        try {
            is = new FileInputStream(
                    "E:\\JDBC\\src\\main\\resources\\druid.properties");
            pro.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Holder {
        private static MyDruid druid = new MyDruid();
    }

    public static MyDruid getdruid() {
        return Holder.druid;
    }

//    // 方式一：
//    public Connection testGetConnection() throws Exception {
//        // 创建DBCP数据库连接池
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/school");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn);
//        return conn;
//    }

    // 方式二：推荐 使用配置文件
    public Connection getConnection() throws Exception {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        return conn;
    }
}

