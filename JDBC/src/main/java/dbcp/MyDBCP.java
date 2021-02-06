package dbcp;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public final class MyDBCP {

    private DataSource dataSource;

    private MyDBCP() {
        Properties pro = new Properties();
        FileInputStream is = null;//方式 二
        dataSource = new BasicDataSource();
        try {
            is = new FileInputStream(
                    "E:\\JDBC\\src\\main\\resources\\dbcp.properties");
            pro.load(is);        // 创建了一个DBCP数据库连接池
            dataSource = BasicDataSourceFactory.createDataSource(pro);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Holder {
        private static MyDBCP dbcp = new MyDBCP();
    }

    public static MyDBCP getDbcp() {
        return Holder.dbcp;
    }

    public Connection getConnection() throws Exception {
        Connection conn = dataSource.getConnection();
        return conn;
    }
    // 方式一：
//    public Connection testGetConnection() throws SQLException {
//        // 创建DBCP数据库连接池
//        BasicDataSource source = new BasicDataSource();
//        // 设置基本信息
//        source.setDriverClassName("com.mysql.jdbc.Driver");
//        source.setUrl("jdbc:mysql://localhost:3306/school");
//        source.setUsername("root");
//        source.setPassword("123456");
//        // 其他设置数据库连接池管理的相关属性
//        source.setInitialSize(10);
//        source.setMaxActive(20);
//        Connection conn = source.getConnection();
//        System.out.println(conn);
//        return conn;
//    }

    // 方式二：推荐 使用配置文件
}
