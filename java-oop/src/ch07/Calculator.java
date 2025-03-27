package ch07;

public class Calculator {

	public boolean power;
	public int num;
	

	public Calculator() {
		this.power = false;
	}
	// static은 안에 this를 안쓸때
	public void setPower() {
		this.power = !this.power;   
	}
	
	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) 
	{
		double result = 0.0;
		if(!this.power) { // this.power == false 일떄
			
		}else {
		    if(!(rate >= 0.5 && rate <=1.5)) { 
		    	System.out.println("입력값 error");
		    }else {  
		    	result = this.num * rate;
		    }
		}
		 return result;
	}
	
	
	
	public void setNum(int num) {
		if(this.power) {
			this.num = num;
		} else {
			System.out.println("계산기가 off 상태");
		}
	}
	
	// this.num이 짝수인지 홀수 인지 알고 싶은 메서드
	public String checkNum() {
	String result = "";
	if(!this.power) {
		result = "에러";
    } else {
		result =  (this.num % 2 == 0) ? "짝수" : "홀수";
	}
     return result;
	  
}
	
	
	
	
	

}
