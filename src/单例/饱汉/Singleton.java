package ����.����;
/**
 * ����������
 * 
 * ���⣺�ڶ��߳�״̬�£����A,Bͬʱִ�е�if�����ж�
 * A�ж�singletonΪ��׼��ִ�У�Ȼ���ó���CPUʱ��Ƭ��
 * BҲ�ж�singletonΪ�գ�����ִ�У���ʱ������һ��ʵ������
 * A��ȡ��CPUʱ��Ƭ�����ִ�У�Ҳ������ʵ��������͵��¶����������������
 * @author xuxiao
 *
 */
public class Singleton {
	
	private static Singleton singleton;

	private Singleton() {
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			return new Singleton();
		}
		return singleton;
	}

}
