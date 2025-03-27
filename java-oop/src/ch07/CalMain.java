package ch07;

public class CalMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.power); // false
		c.setPower(); 
		System.out.println(c.power);
		System.out.println(c.num);
		c.setNum(5);
		System.out.println(c.num);
		
		double rate = Math.random()*(1.5-0.5)+0.5;
		c.setRateNum(rate);
		
		System.out.println(c.setRateNum(rate));
		
	}
}
