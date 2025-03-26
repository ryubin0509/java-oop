package ch02;

public class EnumTest {
	public static void main(String[] args) {
		char gender = 'ㅁ'; // M,F
		
		if(gender == 'M') {
			System.out.println("남자");
		} else if (gender == 'F') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다.");
		}
		// 열거타입은 그 특정한 값을 제외하고는 다른 값이 들어오지 않기에 잘못된 값이 들어오지 않는다.
		
		Gender gender2 = null;
		gender2 = Gender.MALE; 
		
		if(gender2 == Gender.MALE) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// Enum 사용시 if보다 switch가 가독성이 높을 수도 있다.
		switch(gender2) {
		case Gender.MALE:
			System.out.println("남자");
			break;
			
		case Gender.FEMALE:
			System.out.println("여자");
			break;
		}
	}

}
