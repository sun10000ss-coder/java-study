package ex1;

public class Animal {
	String name;
	int age;
	String color;
	
	public void eat(){
		System.out.println(name+"가 먹이를 먹어여");
	}
	public void sleep(){
		System.out.println(name+"가 잠을 자여");
	}
	public void show(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		
	}
}
	//자식클래스(서브 클래스)
	class Dog extends Animal{
		
	}

