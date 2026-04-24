package javastart;

import java.util.Scanner;

class StudentP {
	String name;
	int score;
	public StudentP(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
}

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수 키보드로 부터 입력
		System.out.println("반 학생수 입력하새요");
		int cnt = sc.nextInt();
		sc.nextLine();
		//학생수만큼 배열 생성
		StudentP [] stu = new StudentP[cnt];
		//반복문을 통해서 배열 요소 객체 생성
		//값을 키보드로부터 입력 받음
		for(int i=0; i<stu.length; i++) {
			System.out.println((i+1)+"번째 학생이름을 입력하세여:");
			String name= sc.nextLine();
			System.out.println((i+1)+"번쨰 학생 접수 입력하세여:");
			int score= sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name,score);
			
		}
		while(true) {
			System.out.println("검색할 이름을 쓰세여:");
			String sname= sc.nextLine();
			
			if(sname.equals("그만")) break;//while문 탈출
			
			boolean k = false;
			for(int j=0; j<stu.length; j++){
					if(stu[j].name.equals(sname)) {
						System.out.println(sname+"의 점수는"+stu[j].score);
						k=true;
						break;//for문 탈출
					}//if	
		}//for
			if(k) {//boolean은 기본이 true->false이면 !(not)
				System.out.println("찾는 사람이 없어여");
			}//if 
		}//while
		sc.close();
		System.out.println("프로그램을 종려할게여");
	}//main문
}//class문