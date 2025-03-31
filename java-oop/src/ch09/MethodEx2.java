

package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	
	// 반환타입: Map
	// 매개타입: Student

	
	public HashMap<String,Object> m9a(Student s ){
		HashMap<String,Object> map  = new HashMap<String,Object>();
		map.put("name",s.name);
		map.put("num",s.num);
		return  map;
	}
	
	
	
	
	// 반환타입 : List<String>
	// 매개타입 : 임의의 개수의 문자열
	public ArrayList<String> m8a(String ... name){
		ArrayList<String> result = new ArrayList<String>();
		for(String st2  :name) {
			result.add(st2);
			
		}
		return result;
	}
	
	
	
	// 반환타입 : Student[]
	// 매개타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String,Object>>list){
		Student[] st = new Student[list.size()];  // 빈 배열 생성
		int i = 0;
		
		for(HashMap<String,Object> s: list) {
			st[i] = new Student();
			st[i].num = ((Integer)s.get("num"));
			st[i].name = ((String)s.get("name"));
			
			i++;
		}
		
		
		return st;
		
	}
	
	
	
	// 반환타입: 클래스
	// 입력타입: int,String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		
		return s;
	}
	
	
	
	
	// 반환타입 : 배열
	// 매개타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num) { // 나누기 연산
 		int length = Integer.toString(num).length();
		int[] result = new int[length];
 		
 		for(int i = 0;  num> 0; i++) {
 			result[i] = num%10;
 			num = num/10;
 			
 			
 			
 		} 
		return result;
		
	}
	
	// 252 -> {"2", "5", "2" }
	public String[] m5b(int num) { // subString( 메서드
		String[] result = null;
		String num1  = ""+num; // 문자열 변환 
		result = new String[num1.length()]; // 문자열만큼 배열크기 생성
		for(int i=0; i<num1.length(); i++) {
			if(	i<num1.length()) {
				result[i] = num1.substring(i,i+1);
			} else if(i == num1.length()) {
				result[i] = num1.substring(i);
			}
		}
		
		
		return result; // String 배열로 출력하기는 하나 주소의 위치가 출력되는 것이지 그 안에 든 값이 출력되는 것이아님.
	}
	
	
	
	// 반환타입 : 배열
	// 매개타입 : List 
	// List를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()];  // 리스트의 사이즈만큼 int 배열을 생성
		int i = 0;
			for(String s : list) {
				  result[i] = Integer.parseInt(s);
				  i++; 
			}

		return result;
	}
	
	// 반환타입 : boolean
	// 매개타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		if(s1.name.equals(s2.name)&& s1.num == s2.num) {
			result = true;
		}
		
		
		return result; 
		
	}
	
	
	// Student타입을 디버깅한 문자열을 반환하는 메서드
	// 반환타입 : String
	// 매개타입 : 클래스 하나
	
	public String m25a(Student s) {
		String result = " ";
	    result += "번호는"+s.num +"이고,"+"이름은"+s.name+"입니다.";
		return result;
	}
	
	// 반환타입 숫자
	// 매개타입 배열 : 배열
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24a(int[] arr) {
		
		boolean flag = true;
		int i = 0;
		while(flag) {
			try {
			int temp = arr[i];
			} catch(Exception e) {
				return i;
			}
			i++;
		}
		return i;
	}	
	
	
	
	public int m24b(int[] arr) {
		int result = 0;
		for(int i : arr){
			{
				result++;
		
		}
	
		}
		return result;
	}
}
