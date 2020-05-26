package ����.����;
/**
 * ����������������⣬���߳��¿���ͬʱ��õ�������
 * 
 * ���⣺
 * ������������һ��һ�������⣬������߳�ͬʱִ�е������ж����ʱ��
 * �ᴴ�����ʵ����
 * A,Bͬʱ�ж�Ϊ�գ�ͬʱִ��if��ֻ������A������ȴ�������B�������󴴽�����
 * 
 * ���������
 * �������ڵ�һ���̴߳���һ��ʵ��֮��singleton�Ͳ���Ϊ���ˣ�
 * ���Ǻ������̲߳�û�����ڶ��ηǿռ�顣
 * ��ô�����ԣ���ͬ���������Ӧ���ٴ�����飬Ҳ������ν��˫�ؼ��
 * @author xuxiao
 *
 */
public class Singleton3 {
	private static Singleton3 singleton3;

	private Singleton3() {
	}
	public static Singleton3 getInstance() {
		if(singleton3==null) {
			synchronized (Singleton3.class) {
				return new Singleton3();//1
			}			
		}
		return singleton3;
	}
}
