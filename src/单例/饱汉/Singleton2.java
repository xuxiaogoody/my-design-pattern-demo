package 单例.饱汉;
/**
 * 解决懒加载在多线程的问题
 * 
 * 新问题：
 * 解决了多线程并发的问题，但是却带来了效率问题：
 * 我们的目的是只创建一个实例，即//1处代码只会执行一次，
 * 也正是这个地方才需要同步。但现在的写法是锁住了整个方法
 * 同一时间只能有一个线程获得这个单例对象，效率低下
 * 
 * 
 *解决方案：
 * 为此我们考虑只对//1进行同步
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
