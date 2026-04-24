package javastart;

public class Var2 {

	public static void main(String[] args) {
		final double PI =3.14;//final 불변 
		double res= PI *10;
		PI = 5.0;
		double res1= PI *10;
		System.out.println(res);
		
		
		
		//var : 자동으로 변수의 타입(형) 결정
		//var x=5;
		//System.out.println(x++ + ++x);
		//System.out.println(2*1500+300+"hello");
		//var k=30.5;
		//var y=12.3f;
		//String n="java";
		//System.out.println(x+" "+k +" "+y +" "+n);
		
	}

}
