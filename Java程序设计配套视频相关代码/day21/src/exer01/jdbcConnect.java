package exer01;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class jdbcConnect {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/_db3";
		
		//1.创建Driver驱动的对象
		Driver driver = new Driver();
		
		//2.获取账号与密码
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password","root");
		
		//3.连接数据库
		Connection connection = driver.connect(url, properties);
		
		System.out.println(connection);
		
	}
}
