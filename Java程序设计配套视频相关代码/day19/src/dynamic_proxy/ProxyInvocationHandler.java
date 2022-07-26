package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 代理类
 */

//动态代理要实现接口：InvocationHandler
public class ProxyInvocationHandler implements InvocationHandler{
	
	//实现了接口的被代理类的对象的声明【在这里：老师类对象的声明】
	Object object;
	
	//创建代理类的对象
	public Object create(Object object) {
		
		this.object = object;//实例化被代理类的对象
		
		//返回代理类的实例化对象
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
	}
	
	//重写接口中的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.print("[代理类]");
		Object returnValue =  method.invoke(object,args);//调用object的方法
		
		//返回调用方法的返回值
		return returnValue;
	}
}
