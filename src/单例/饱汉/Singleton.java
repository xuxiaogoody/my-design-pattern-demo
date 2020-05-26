package 单例.饱汉;
/**
 * 单例懒加载
 * 
 * 问题：在多线程状态下，如果A,B同时执行到if条件判断
 * A判断singleton为空准备执行，然后让出了CPU时间片；
 * B也判断singleton为空，接着执行，此时创建了一个实例对象；
 * A获取了CPU时间片后接着执行，也创建了实例对象，这就导致多个单例对象的情况。
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
