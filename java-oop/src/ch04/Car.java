package ch04;

public class Car {
	public Car() {
		
	}
	public boolean onOff;
	
	public void move() {
		// 각 객체의 변수를 가리킬때에는 this로 구분해야한다. 
		if(this.onOff){ 
			System.out.println("자동차 Move!");
		}else{
			System.out.println("시동부터..");
		}
	}
}
