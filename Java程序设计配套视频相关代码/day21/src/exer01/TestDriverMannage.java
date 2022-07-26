package exer01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * DriverManage 是驱动的管理类
 * 		1）可以通过重载的getConnection()方法获取数据库连接
 * 		2）可以同时管理多个驱动程序
 */

public class TestDriverMannage {

	public static void main(String[] args) throws Exception {
		
		TestDriverMannage t = new TestDriverMannage();
		
		t.openConnection();
		
	}
	
	public  void openConnection() throws Exception {
		
		//1.准备连接数据库的4个字符串
		String driver = null;
		String jdbcUrl = null;
		String jdbcUser = null;
		String jdbcPassword = null;
		
		//2.通过InputStream流获取jdbc.properties文件中的信息		
		InputStream inputStream =  getClass().getClassLoader().getResourceAsStream("exer01//jdbc.properties");
		
		//3.准备读取文件中的信息
		Properties properties = new Properties();

		//加载文件中的信息
		properties.load(inputStream);
		
		//4.从文件中获取信息,并赋值
		driver = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcURL");
		jdbcUser = properties.getProperty("user");
		jdbcPassword = properties.getProperty("password");
		
		//5.获取数据库驱动程序【对应的Driver实现类中有注册驱动的静态代码块】
		Class.forName(driver);
		
		//6.进行连接
		Connection connection =  DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword);
		
		//7.查看是否连接成功
		System.out.println("数据库连接成功:"+connection);
		
		inputStream.close();
		connection.close();
	}
}
