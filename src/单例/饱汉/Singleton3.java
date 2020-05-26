package 单例.饱汉;
/**
 * 解决了锁的粒度问题，多线程下可以同时获得单例对象
 * 
 * 问题：
 * 这样会带来与第一种一样的问题，即多个线程同时执行到条件判断语句时，
 * 会创建多个实例。
 * A,B同时判断为空，同时执行if，只不过是A获得锁先创建对象，B后获得锁后创建对象
 * 
 * 解决方案：
 * 问题在于当一个线程创建一个实例之后，singleton就不再为空了，
 * 但是后续的线程并没有做第二次非空检查。
 * 那么很明显，在同步代码块中应该再次做检查，也就是所谓的双重检测
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
