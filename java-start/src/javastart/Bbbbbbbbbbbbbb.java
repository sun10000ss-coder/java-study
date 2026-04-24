package javastart;

import java.util.Scanner;

public class Bbbbbbbbbbbbbb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		String input = sc.nextLine();
		
		Double d = Double.parseDouble(input);
		
		String str1=Double.toString(d);
		String str2=String.valueOf(d);
		
		System.out.println("이름 문자열 :" + input);
        System.out.println("숫자로 변환 :" + d);
        System.out.println("다시 문자열로 변환(toString) :" + str1);
        System.out.println ("다시 문자열로 변환(valueof) :"+ str2);
        
		sc.close();

	}
}
