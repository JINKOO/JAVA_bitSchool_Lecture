package kr.ac.smu.day09;

public class Child01 extends Parent {

	String name = "�ڽ�";
	int age = 15;
	
	public void study() {
		System.out.println("���θ� �մϴ�.");
	}
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	
	@Override
	public void info() {
		System.out.println("ù��° �ڽĿ��� �������̵� �� �޼ҵ� info()...");
	}
}