package exer01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * DriverManage �������Ĺ�����
 * 		1������ͨ�����ص�getConnection()������ȡ���ݿ�����
 * 		2������ͬʱ��������������
 */

public class TestDriverMannage {

	public static void main(String[] args) throws Exception {
		
		TestDriverMannage t = new TestDriverMannage();
		
		t.openConnection();
		
	}
	
	public  void openConnection() throws Exception {
		
		//1.׼���������ݿ��4���ַ���
		String driver = null;
		String jdbcUrl = null;
		String jdbcUser = null;
		String jdbcPassword = null;
		
		//2.ͨ��InputStream����ȡjdbc.properties�ļ��е���Ϣ		
		InputStream inputStream =  getClass().getClassLoader().getResourceAsStream("exer01//jdbc.properties");
		
		//3.׼����ȡ�ļ��е���Ϣ
		Properties properties = new Properties();

		//�����ļ��е���Ϣ
		properties.load(inputStream);
		
		//4.���ļ��л�ȡ��Ϣ,����ֵ
		driver = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcURL");
		jdbcUser = properties.getProperty("user");
		jdbcPassword = properties.getProperty("password");
		
		//5.��ȡ���ݿ��������򡾶�Ӧ��Driverʵ��������ע�������ľ�̬����顿
		Class.forName(driver);
		
		//6.��������
		Connection connection =  DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword);
		
		//7.�鿴�Ƿ����ӳɹ�
		System.out.println("���ݿ����ӳɹ�:"+connection);
		
		inputStream.close();
		connection.close();
	}
}
