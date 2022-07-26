package exer04;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

/**
 * JDBC工具类： 1.连接数据库 2.释放连接 3.对数据库进行增删改 4.对数据库进行查询
 * 
 * @author star-dream
 *
 */
public class JdbcTools {

	/**
	 * 获取数据库连接
	 * 
	 * @return 返回一个数据库连接 Connection
	 * @throws Exception
	 */
	private static Connection getConnection() throws Exception {

		// 准备连接数据库的4个字符串
		String driver = null;
		String jdbcUrl = null;
		String jdbcUser = null;
		String jdbcPassword = null;

		// 创建输入流的对象
		InputStream inputStream = JdbcTools.class.getClassLoader().getResourceAsStream("exer04//jdbc.properties");

		// 创建Properties的对象
		Properties properties = new Properties();

		// 加载properties配置文件到程序中
		properties.load(inputStream);

		// 获取文件中的数据
		driver = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcURL");
		jdbcUser = properties.getProperty("user");
		jdbcPassword = properties.getProperty("password");

		// 获取数据库驱动程序
		Class.forName(driver);

		// 进行连接
		Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

		// 返回连接
		return conn;
	}
	
	/**
	 * 释放连接
	 * 
	 * @param connection 获取的连接
	 * @param statement
	 * @param resultSet     结果集
	 */
	private static void release(Connection connection, Statement statement,ResultSet resultSet) {
		
		
		//判断结果集是否为null
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 判断连接是否为空
		if (statement != null) {

			// 为了保证连接必须关闭,使用异常处理，防止因为statement关闭出现异常,connection未能够关闭
			try {
				statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 修改数据库 INSERT UPDATE DELETE
	 * 
	 * @param sql 传入一个SQL语句
	 */
	public static void update(String sql,Object ... args) {

		// 获取数据库连接
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			// 获取连接
			conn = getConnection();
			preparedStatement = conn.prepareStatement(sql);
			
			//将SQL语句的占位符进行赋值
			for(int i = 0;i < args.length;i++) {
				preparedStatement.setObject(i + 1, args[i]);
			}

			// 执行SQL语句
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 释放连接
			release(conn, preparedStatement,null);
		}
	}
	
	/**
	 * 对数据库进行查询
	 * @param sql
	 * @return 获取查询到的学生
	 */
	public static Student getStudent(String sql,Object args) {
		
		Student student = null;
		
		//数据库连接
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = getConnection();
			
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setObject(1, args);
			
			resultSet =  preparedStatement.executeQuery();
			
			//判断是否存在
			if (resultSet.next()) {
				student = new Student(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3), 
						resultSet.getDate(4), resultSet.getString(5), resultSet.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//释放连接
			release(connection, preparedStatement, resultSet);
		}		
		
		//将结果返回
		return student;
	}
}



































