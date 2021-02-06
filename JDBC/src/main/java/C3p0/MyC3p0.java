package C3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class MyC3p0 {

    //数据源对象
    private ComboPooledDataSource dataSource;

    private MyC3p0() {
        dataSource = new ComboPooledDataSource();
        FileInputStream in = null;
        try {
            Properties pro = new Properties();
            in = new FileInputStream("E:" +
                    "\\JDBC\\src\\main\\resources\\db.properties");
            pro.load(in);
            dataSource.setDriverClass(pro.getProperty("jdbcDriver"));
            dataSource.setJdbcUrl(pro.getProperty("jdbcUrl"));
            dataSource.setUser(pro.getProperty("userName"));
            dataSource.setPassword(pro.getProperty("password"));
            dataSource.setMaxIdleTime(Integer.parseInt(pro.getProperty("maxIdleTime")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    private static class Holder {
        private static MyC3p0 c3p0 = new MyC3p0();
    }

    public static MyC3p0 getMyC3p0() {
        return MyC3p0.Holder.c3p0;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
