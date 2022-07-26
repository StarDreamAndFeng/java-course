package exer01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

/**
 * JDBC工具类： 1.连接数据库 2.释放连接
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
		InputStream inputStream = JdbcTools.class.getClassLoader().getResourceAsStream("exer01//jdbc.properties");

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
	 * 释放连接[不包括查询]
	 * 
	 * @param connection 获取的连接
	 * @param statement
	 */
	private static void release(Connection connection, Statement statement) {

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
	 * 释放连接【包括查询】
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
	private static void update(String sql) {

		// 获取数据库连接
		Connection conn = null;
		Statement statement = null;

		try {

			// 获取连接
			conn = getConnection();
			statement = conn.createStatement();

			// 执行SQL语句
			statement.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 释放连接
			release(conn, statement);
		}
	}
	
	/**
	 * 插入数据【根据不同的数据库，写不同的插入方法】
	 * @param id                水果的id
	 * @param name          水果的名称
	 * @param price           水果的价格
	 * @param number      水果的库存数量
	 */
	public static void insert(int id,String name,float price,int number){
		
		String sql = null;
		
		//INSERT INTO fruits VALUES(1,'苹果',7.8,50); [仿造格式]
		//写出SQL语句
		sql = "INSERT INTO fruits VALUES(" + id +",\'" +
		name + "\'," + price + "," + number+");";
		
		//执行操作
		update(sql);
	}
	
	/**
	 * 修改水果表的ID
	 * @param id 该水果的id号
	 * @param which_fruit 指明要修改的是哪一个水果
	 */
	public static void changeId(int id,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = '苹果';
		sql = "UPDATE fruits SET id = " + id + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * 修改水果表的价格
	 * @param price 该水果的价格
	 * @param which_fruit 指明要修改的是哪一个水果
	 */
	public static void changePrice(float price,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = '苹果';
		sql = "UPDATE fruits SET price = " + price + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * 修改水果表的库存
	 * @param number 修改该水果的数量
	 * @param which_fruit 指明要修改的是哪一个水果
	 */
	public static void changeNumber(int number,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = '苹果';
		sql = "UPDATE fruits SET number = " + number + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * 删除水果表中的数据
	 * @param which_fruit 要删除哪一个水果
	 */
	public static void delete(String which_fruit) {
		
		String sql = null;
		
		//DELETE FROM fruits WHERE name = '苹果';
		sql = "DELETE FROM fruits WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * 对水果表进行查询
	 */
	public static void query() {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;//结果集：用来接受查询到的数据
		
		try {
			
			//1.获取连接
			connection = getConnection();
			
			//2.获取Statement
			statement = connection.createStatement();
			
			//3.获取SQL语句
			String sql = "SELECT * FROM fruits;";
			
			//4.执行查询,并将结果(整张数据表)返回给resultSet进行保存
			resultSet =  statement.executeQuery(sql);
			
			//5.在控制台上打印输出
			while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				int number = resultSet.getInt("number");
							
				System.out.println(id + "\t" + name + "\t" + String.format("%.2f",price) + "元\t" + number + "个");
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.释放连接
			release(connection, statement, resultSet);
		}		
	}
	
}
