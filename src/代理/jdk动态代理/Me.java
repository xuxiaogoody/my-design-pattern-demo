package ����.jdk��̬����;

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
		System.out.println("�ҽ�"+name+",��Ҫһ��"+type);
		
	}


	@Override
	public void get() {
		System.out.println("get");
		
	}

}
