package ch05;

public class ClassMember {
	//  1. static : 클래스와는 무관 공간과 이름만을 빌려다 쓰는 요소들
	// 1-1) static method
	public static void sFun(){
		System.out.println("sFun()");
	}
	// 1-2) static field
	public static int x=1+1;  
	
	public static int[] arr =  null;
	
	// 1-3) static block 
	static { 
		ClassMember.arr = new int[3];
		for(int i=0; i <ClassMember.arr.length; i++) {
			int rNum =  (int)(Math.random()+10)+1;
			ClassMember.arr[i] = rNum;
		}
	}




	
	// e.
	public void fun() {
		System.out.println("fun()");
	}
	// 3. 필드
	public String name;
	
	// 4. 생성자
	public ClassMember() { // 없으면 기본형태로 자동으로 생성됨.
		this.name = null; 
	}
	
	public class InClass{} // 내부클래스
	public enum InEnum{ // 내부 Enum
		x,y
	}
	public interface InInterface{}// 내부 인터페이스
	public @interface InAnnotation{} // 내부 에노테이션
}