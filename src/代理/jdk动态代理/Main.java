package 代理.jdk动态代理;

public class Main {
	public static void main(String[] args) {
		People people = (People)new Huangniu().getInstance(new Me("xuxiao","演唱会门票"));
	    people.get();
	    people.speck();
	    System.out.println("生成代理对象后变成"+people.getClass());
	}

}
