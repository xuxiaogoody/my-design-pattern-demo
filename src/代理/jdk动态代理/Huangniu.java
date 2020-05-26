package ����.jdk��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Huangniu implements InvocationHandler{
	private People people;
	public Object getInstance(People people) {
		this.people = people;
		Class<? extends People> clazz = people.getClass();
		System.out.println("û���ɴ�����֮ǰ��class����"+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

    /**
     * @param proxy     ������
     * @param method    ���ڵ��õķ���
     * @param args      �����Ĳ���
     * @return
     * @throws Throwable
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("������");
		System.out.println(method);
		method.invoke(people);
		System.out.println("���������");
		return null;
	}

}
