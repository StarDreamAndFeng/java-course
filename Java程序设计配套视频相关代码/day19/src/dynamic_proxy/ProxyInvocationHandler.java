package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * ������
 */

//��̬����Ҫʵ�ֽӿڣ�InvocationHandler
public class ProxyInvocationHandler implements InvocationHandler{
	
	//ʵ���˽ӿڵı�������Ķ�����������������ʦ������������
	Object object;
	
	//����������Ķ���
	public Object create(Object object) {
		
		this.object = object;//ʵ������������Ķ���
		
		//���ش������ʵ��������
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
	}
	
	//��д�ӿ��еķ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.print("[������]");
		Object returnValue =  method.invoke(object,args);//����object�ķ���
		
		//���ص��÷����ķ���ֵ
		return returnValue;
	}
}
