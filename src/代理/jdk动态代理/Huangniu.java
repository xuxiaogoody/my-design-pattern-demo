package 代理.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Huangniu implements InvocationHandler{
	private People people;
	public Object getInstance(People people) {
		this.people = people;
		Class<? extends People> clazz = people.getClass();
		System.out.println("没生成代理类之前的class对象"+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

    /**
     * @param proxy     代理类
     * @param method    正在调用的方法
     * @param args      方法的参数
     * @return
     * @throws Throwable
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理中");
		System.out.println(method);
		method.invoke(people);
		System.out.println("代理处理完毕");
		return null;
	}

}
