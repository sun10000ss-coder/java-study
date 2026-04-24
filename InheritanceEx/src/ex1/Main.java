package ex1;



public class Main {
	public static void main(String[] args) {
		Dog d = new Dog(); 
		
		System.out.println("부모 멤버 사용");
		d.name="윤태원";
		d.age=18;
		d.color="노란색";
		d.bark=
		System.out.println(d.name+","+d.age+","+d.color);
		
		d.eat();//부모
		d.sleep();//부모
		// 자식 클래스 메서드 호출
		d.bark();//자식
		d.run();//자식
	}
}
