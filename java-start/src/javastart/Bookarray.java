package javastart;

import java.util.Scanner;

class Book3{
	int price;
	String title;
	public Book3(String title, int price) {
		this.title = title;
		this.price = price;
	}
}

public class Bookarray {

	public static void main(String[] args) {
		Book3[] c;
		c = new Book3[3]; 
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<c.length; i++) {
			System.out.println("제목 입력");
			String title = sc.nextLine();
			System.out.println("가격 입력");
			int price = sc.nextInt();
			sc.nextLine();
				c[i] = new Book3(title,price);
		}
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j].title +","+c[j].price);
	}
		sc.close();
	}
}
