package pack2;

import pack1.Parent;

public class Child extends Parent{
	public void printChild() {
		System.out.println("== 지식 클래스 접근 ==");
		System.out.println("public a =" + a);
		System.out.println("protected b =" + b);
		System.out.println("default c =" + c);//패키지가 달라서 안 됨
		System.out.println("private d =" + d);//클래스가 달라서 안 됨
	}
}
