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
 * JDBC�����ࣺ 1.�������ݿ� 2.�ͷ����� 3.�����ݿ������ɾ�� 4.�����ݿ���в�ѯ
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
		InputStream inputStream = JdbcTools.class.getClassLoader().getResourceAsStream("exer04//jdbc.properties");

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
	 * �ͷ�����
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
	public static void update(String sql,Object ... args) {

		// ��ȡ���ݿ�����
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			// ��ȡ����
			conn = getConnection();
			preparedStatement = conn.prepareStatement(sql);
			
			//��SQL����ռλ�����и�ֵ
			for(int i = 0;i < args.length;i++) {
				preparedStatement.setObject(i + 1, args[i]);
			}

			// ִ��SQL���
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// �ͷ�����
			release(conn, preparedStatement,null);
		}
	}
	
	/**
	 * �����ݿ���в�ѯ
	 * @param sql
	 * @return ��ȡ��ѯ����ѧ��
	 */
	public static Student getStudent(String sql,Object args) {
		
		Student student = null;
		
		//���ݿ�����
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = getConnection();
			
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setObject(1, args);
			
			resultSet =  preparedStatement.executeQuery();
			
			//�ж��Ƿ����
			if (resultSet.next()) {
				student = new Student(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3), 
						resultSet.getDate(4), resultSet.getString(5), resultSet.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ͷ�����
			release(connection, preparedStatement, resultSet);
		}		
		
		//���������
		return student;
	}
}



































