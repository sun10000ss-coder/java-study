package javastart;

class Student{
	String name;
	int score;
	//생성자(constructor) : 객체 생성할때 값을 부여 
	//객체샐성할때 1선 수행
	
	void printInfo(){
		System.out.println(name+","+score);
	}
}

public class Main {
	 public static void main(String[] args) {//main mathod
		
		 Student s1= new Student("윤태원",90);
		 Student s2= new Student("이순신",100);
		 //Student() : 클래스
		 //new :객체 생성 연산자
		 //s1 : 참조변수, 객체 생성
		 
//		 s1.name ="윤태원";//.(점)은 멤버 접근 연산자
//		 s1.score=90;
		 s1.printInfo();
		 
		 System.out.println("이름은"+s1.name);
		 System.out.println("점수는"+s1.score);
		 
		 //s2.name ="이순신";
		 //s2.score=100;
		 s2.printInfo();
		 
		 System.out.println("이름은"+s2.name);
		 System.out.println("점수는"+s2.score);
		 
		 
	}
}

class Student{//클래스 (설계도) 생성
	String name;//멤버변수 
	int score;//멤버변수
	
	Student(String n, int s);{//생성자(클래서 이름과 동일)
		name =n;
		score =s;
	}
}