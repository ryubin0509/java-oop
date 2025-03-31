package ch09;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2Main {
	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		

		int num1 = 1234;
		int[] result3 = m2.m5a(num1);
		for(int i : result3) {
			System.out.println(i);
			
		
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Student st3 = new Student();
		st3.name = "루우피";
		st3.num = 111; 
		HashMap<String,Object>map9 = m2.m9a(st3);
		System.out.println(map9.get("name"));
		System.out.println(map9.get("num"));
		
		
		
		
		
		
		ArrayList<String> nameList 
		= m2.m8a("루피","조로","상디11");
		for(String s9 : nameList) {
		  System.out.println(s9);	
		}
		
		
		ArrayList<HashMap<String,Object>> list2 = new ArrayList<HashMap<String,Object>>();
		HashMap<String,Object>map = new HashMap<String,Object>();
		map.put("num", 11);
		map.put("name", "샹크스");
		list2.add(map);
		
		
		HashMap<String,Object>map2 = new HashMap<String,Object>();
		map2.put("num", 21);
		map2.put("name", "버기");
		list2.add(map2);
		
		Student[] st = m2.m7a(list2);
		
		for(Student s5 :st) {
			System.out.println(s5.num);
			System.out.println(s5.name);
			
		}
		
		
		
		
		Student qw = m2.m6a(1,"로빈");
		System.out.println(qw.num);
		System.out.println(qw.name);
		
		

		
		
		int num = 252;
		String[] s5=m2.m5b(num);
		for(String number: s5) {
			System.out.println(number);
		}
				
		
	
		
		
		ArrayList<String> list
			= new ArrayList<String>();
		list.add("101");
		list.add("200");
		list.add("999");
		int[] result = m2.m4a(list);
		for(int n: result) {
			System.out.println(n);
		}
		
		
		Student s1 = new Student();
		s1.num = 2;
		s1.name = "조로";
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "나미";
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "나미";
		
		
	
		System.out.println(m2.m25a(s2));
		System.out.println(m2.m24c(s2,s3));
		
		
		int[] arr= new int [7];
		System.out.println(m2.m24a(arr));
		System.out.println(m2.m24b(arr));
		
		
	}
}
