package ����.jdk��̬����;

public class Main {
	public static void main(String[] args) {
		People people = (People)new Huangniu().getInstance(new Me("xuxiao","�ݳ�����Ʊ"));
	    people.get();
	    people.speck();
	    System.out.println("���ɴ���������"+people.getClass());
	}

}
