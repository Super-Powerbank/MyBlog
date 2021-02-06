package druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DruidApp {
    public static void main(String[] args) {
        MyDruid druid = MyDruid.getdruid();
        PreparedStatement pre = null;
        Connection connection = null;
        try {
            connection = druid.getConnection();
            String sql = "select * from student where SID > ?";
            pre = connection.prepareStatement(sql);
            pre.setString(1, "01");
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next()) {  //hashnext next  -1
                System.out.println("SID:" + resultSet.getString(1) +
                        "     SName:" + resultSet.getString(2)
                        + "   SAge:" + resultSet.getString(3)
                        + "   SSex:" + resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pre.close();
                connection.close();    //将连接归还给链接池
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
