package ����.����;
/**
 * ������˫�ؼ���ģ�������߼����Ѿ����̰߳�ȫ����
 * ������Ȼ���ܳ������⣬����ָ���쳣��
 * 
 * ԭ��ԭ���ǳ���1�ϣ�����jvm���Զ��Գ����Ż����ᷢ��ָ������������
 * ��jvm��ִ��˳�����������˳����ͬ��
 * ����д����ܻ����˳��ĵߵ������ڴ���䡢���ض������á���ʼ����˳��
 * ��������¶�Ӧ��//1����singleton�Ѿ�����null��
 * ����ָ���˶��ϵ�һ��������ʱ��������Ǹ��տ��ӣ�ɶ��û�С�
 * ���Ǵ�ʱB�߳�ȴ�����ѵ������Ѿ������ˣ���ֱ�������ã�������ֿ�ָ���쳣��
 * 
 * �����
 * volatile�ɽ��ָ������������
 * @author xuxiao
 *
 */
public class Singleton4 {
	private static Singleton4 singleton4;

	private Singleton4() {
	}
	public static Singleton4 getInstance() {
		if(singleton4==null) {//һ�ؼ��
			synchronized (Singleton4.class) {//����
				if(singleton4==null) {//���ؼ��
					return new Singleton4();//1
				}				
			}
			
		}
		return singleton4;
	}

}
