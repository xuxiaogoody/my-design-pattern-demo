package ����.����;
/**
 * ����������ڶ��̵߳�����
 * 
 * �����⣺
 * ����˶��̲߳��������⣬����ȴ������Ч�����⣺
 * ���ǵ�Ŀ����ֻ����һ��ʵ������//1������ֻ��ִ��һ�Σ�
 * Ҳ��������ط�����Ҫͬ���������ڵ�д������ס����������
 * ͬһʱ��ֻ����һ���̻߳�������������Ч�ʵ���
 * 
 * 
 *���������
 * Ϊ�����ǿ���ֻ��//1����ͬ��
 * @author xuxiao
 *
 */
public class Singleton2 {
	private static Singleton2 singleton2;

	private Singleton2() {
	}
	public static synchronized Singleton2 getInstance() {
		if(singleton2==null) {
			return new Singleton2();//1
		}
		return singleton2;
	}

}
