package exer01;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class jdbcConnect {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/_db3";
		
		//1.����Driver�����Ķ���
		Driver driver = new Driver();
		
		//2.��ȡ�˺�������
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password","root");
		
		//3.�������ݿ�
		Connection connection = driver.connect(url, properties);
		
		System.out.println(connection);
		
	}
}
