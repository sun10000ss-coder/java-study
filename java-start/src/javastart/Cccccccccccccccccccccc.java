package javastart;

import java.util.Scanner;//Scanner클래스 사용 (컨트롤 쉬프트 O)

public class Cccccccccccccccccccccc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 입력
		System.out.println("숫자를 문자로 입력하세요");
		String a = sc.nextLine();
		//문자열 -> 숫자 변환
		int num = Integer.parseInt(a);
		//숫자 -> 문자열
		String s1=Integer.toString(num);
		String s2=String.valueOf(num);
		
		System.out.println("이름 문자열 :"+a);
		System.out.println("숫자로 변환 :"+num);
		System.out.println("다시 문자열로 변환(toString) :"+s1);
		System.out.println("다시 문자열로 변환(valueof) :"+s2);
		
		sc.close();
	}
}
