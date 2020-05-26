package 代理.jdk动态代理;

public class Me implements People{
	private String name;
	private String type;
	public Me(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

    public void play() {
    	System.out.println("play");
    }
	@Override
	public void speck() {
		System.out.println("我叫"+name+",我要一张"+type);
		
	}


	@Override
	public void get() {
		System.out.println("get");
		
	}

}
