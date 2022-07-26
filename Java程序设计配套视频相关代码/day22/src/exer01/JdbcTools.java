package exer01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

/**
 * JDBC�����ࣺ 1.�������ݿ� 2.�ͷ�����
 * 
 * @author star-dream
 *
 */
public class JdbcTools {

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return ����һ�����ݿ����� Connection
	 * @throws Exception
	 */
	private static Connection getConnection() throws Exception {

		// ׼���������ݿ��4���ַ���
		String driver = null;
		String jdbcUrl = null;
		String jdbcUser = null;
		String jdbcPassword = null;

		// �����������Ķ���
		InputStream inputStream = JdbcTools.class.getClassLoader().getResourceAsStream("exer01//jdbc.properties");

		// ����Properties�Ķ���
		Properties properties = new Properties();

		// ����properties�����ļ���������
		properties.load(inputStream);

		// ��ȡ�ļ��е�����
		driver = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcURL");
		jdbcUser = properties.getProperty("user");
		jdbcPassword = properties.getProperty("password");

		// ��ȡ���ݿ���������
		Class.forName(driver);

		// ��������
		Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

		// ��������
		return conn;
	}

	/**
	 * �ͷ�����[��������ѯ]
	 * 
	 * @param connection ��ȡ������
	 * @param statement
	 */
	private static void release(Connection connection, Statement statement) {

		// �ж������Ƿ�Ϊ��
		if (statement != null) {

			// Ϊ�˱�֤���ӱ���ر�,ʹ���쳣������ֹ��Ϊstatement�رճ����쳣,connectionδ�ܹ��ر�
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
	 * �ͷ����ӡ�������ѯ��
	 * 
	 * @param connection ��ȡ������
	 * @param statement
	 * @param resultSet     �����
	 */
	private static void release(Connection connection, Statement statement,ResultSet resultSet) {
		
		
		//�жϽ�����Ƿ�Ϊnull
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// �ж������Ƿ�Ϊ��
		if (statement != null) {

			// Ϊ�˱�֤���ӱ���ر�,ʹ���쳣������ֹ��Ϊstatement�رճ����쳣,connectionδ�ܹ��ر�
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
	 * �޸����ݿ� INSERT UPDATE DELETE
	 * 
	 * @param sql ����һ��SQL���
	 */
	private static void update(String sql) {

		// ��ȡ���ݿ�����
		Connection conn = null;
		Statement statement = null;

		try {

			// ��ȡ����
			conn = getConnection();
			statement = conn.createStatement();

			// ִ��SQL���
			statement.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// �ͷ�����
			release(conn, statement);
		}
	}
	
	/**
	 * �������ݡ����ݲ�ͬ�����ݿ⣬д��ͬ�Ĳ��뷽����
	 * @param id                ˮ����id
	 * @param name          ˮ��������
	 * @param price           ˮ���ļ۸�
	 * @param number      ˮ���Ŀ������
	 */
	public static void insert(int id,String name,float price,int number){
		
		String sql = null;
		
		//INSERT INTO fruits VALUES(1,'ƻ��',7.8,50); [�����ʽ]
		//д��SQL���
		sql = "INSERT INTO fruits VALUES(" + id +",\'" +
		name + "\'," + price + "," + number+");";
		
		//ִ�в���
		update(sql);
	}
	
	/**
	 * �޸�ˮ�����ID
	 * @param id ��ˮ����id��
	 * @param which_fruit ָ��Ҫ�޸ĵ�����һ��ˮ��
	 */
	public static void changeId(int id,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = 'ƻ��';
		sql = "UPDATE fruits SET id = " + id + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * �޸�ˮ����ļ۸�
	 * @param price ��ˮ���ļ۸�
	 * @param which_fruit ָ��Ҫ�޸ĵ�����һ��ˮ��
	 */
	public static void changePrice(float price,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = 'ƻ��';
		sql = "UPDATE fruits SET price = " + price + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * �޸�ˮ����Ŀ��
	 * @param number �޸ĸ�ˮ��������
	 * @param which_fruit ָ��Ҫ�޸ĵ�����һ��ˮ��
	 */
	public static void changeNumber(int number,String which_fruit) {
		
		String sql = null;
		
		//UPDATE fruits SET id = 101 WHERE name = 'ƻ��';
		sql = "UPDATE fruits SET number = " + number + " WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * ɾ��ˮ�����е�����
	 * @param which_fruit Ҫɾ����һ��ˮ��
	 */
	public static void delete(String which_fruit) {
		
		String sql = null;
		
		//DELETE FROM fruits WHERE name = 'ƻ��';
		sql = "DELETE FROM fruits WHERE name = " + "\'" + which_fruit +"\';";
		
		update(sql);
	}
	
	/**
	 * ��ˮ������в�ѯ
	 */
	public static void query() {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;//��������������ܲ�ѯ��������
		
		try {
			
			//1.��ȡ����
			connection = getConnection();
			
			//2.��ȡStatement
			statement = connection.createStatement();
			
			//3.��ȡSQL���
			String sql = "SELECT * FROM fruits;";
			
			//4.ִ�в�ѯ,�������(�������ݱ�)���ظ�resultSet���б���
			resultSet =  statement.executeQuery(sql);
			
			//5.�ڿ���̨�ϴ�ӡ���
			while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				int number = resultSet.getInt("number");
							
				System.out.println(id + "\t" + name + "\t" + String.format("%.2f",price) + "Ԫ\t" + number + "��");
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.�ͷ�����
			release(connection, statement, resultSet);
		}		
	}
	
}



































