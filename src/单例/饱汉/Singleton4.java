package 单例.饱汉;
/**
 * 单例在双重加载模型下在逻辑上已经是线程安全的了
 * 但是依然可能出现问题，即空指针异常。
 * 
 * 原因：原因还是出在1上，由于jvm会自动对程序优化，会发生指令重排序的情况
 * 即jvm的执行顺序可能与程序的顺序不相同。
 * 无序写入可能会造成顺序的颠倒，即内存分配、返回对象引用、初始化的顺序，
 * 这种情况下对应到//1就是singleton已经不是null，
 * 而是指向了堆上的一个对象，这时这个对象还是个空壳子，啥都没有。
 * 但是此时B线程却看到堆的引用已经出来了，就直接拿来用，结果出现空指针异常。
 * 
 * 解决：
 * volatile可解决指令重排序问题
 * @author xuxiao
 *
 */
public class Singleton4 {
	private static Singleton4 singleton4;

	private Singleton4() {
	}
	public static Singleton4 getInstance() {
		if(singleton4==null) {//一重检测
			synchronized (Singleton4.class) {//加锁
				if(singleton4==null) {//二重检测
					return new Singleton4();//1
				}				
			}
			
		}
		return singleton4;
	}

}
