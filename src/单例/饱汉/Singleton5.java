package ����.����;
/**
 * 
 * @author xuxiao
 *
 */
public class Singleton5 {
	private volatile static Singleton5 singleton5;

	private Singleton5() {
	}
	public static Singleton5 getInstance() {
		if(singleton5==null) {//һ�ؼ��
			synchronized (Singleton5.class) {//����
				if(singleton5==null) {//���ؼ��
					return new Singleton5();
				}				
			}
			
		}
		return singleton5;
	}

}
