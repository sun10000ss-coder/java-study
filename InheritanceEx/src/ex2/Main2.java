package ex2;


public class Main2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.sound();//자식의 메서드를 수행합니다
		d.move();
		
		Animal2 a = new Animal2();
		a.sound();
		a.move();
		
	}
}
