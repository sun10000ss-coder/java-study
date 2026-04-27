package staticex;
	
class Counter2{
	static int cnt = 0;
	
	static void increase() {
		cnt++;
	}
}
public class StaticTest1 {
public static void main(String[] args) {
	
	Counter2.increase();
	Counter2.increase();
	
	System.out.println("count:" + Counter2.cnt);
}
}

//package staticex;
//
////Counter 클래스 정의
//class Counter {
// // 1. static 변수 (정적 변수/클래스 변수)
// // 인스턴스를 생성하지 않아도 메모리에 로드되며, 모든 객체가 이 변수를 공유합니다.
// static int cnt = 0;
// 
// // 2. static 메서드 (정적 메서드)
// // 객체 생성 없이 클래스 이름으로 직접 호출할 수 있는 메서드입니다.
// static void increase() {
//     cnt++; // static 변수 cnt의 값을 1 증가시킵니다.
// }
//}
//
//public class StaticTest1 {
// public static void main(String[] args) {
//     
//     // 3. 클래스 이름을 통한 static 메서드 호출
//     // new Counter() 과정 없이 바로 호출하는 것이 특징입니다.
//     Counter.increase(); // cnt가 1이 됩니다.
//     Counter.increase(); // cnt가 2가 됩니다.
//     
//     // 4. 결과 출력
//     // static 변수 역시 클래스 이름을 통해 직접 접근하여 값을 출력합니다.
//     System.out.println("count:" + Counter.cnt); // 출력: count:2
// }
//}