package 单例.饱汉;
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
		if(singleton5==null) {//一重检测
			synchronized (Singleton5.class) {//加锁
				if(singleton5==null) {//二重检测
					return new Singleton5();
				}				
			}
			
		}
		return singleton5;
	}

}
