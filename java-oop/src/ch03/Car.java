package ch03;

public class Car {
	public Car() {} // 생성자는 클래스 안에서 자동생성된다.
	
	public boolean onOff;
	public String name;
	public String color;
	
	public void move() {
		System.out.println("move");
	}
}
