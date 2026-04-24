package javastart;

class Person {
    String name;
    int age;

    // 생성자 1
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    // 메서드: Void(대문자) -> void(소문자)로 수정
    void checkAdult() {
        if (age >= 19) {
            System.out.println("성인");
        } else if (age >= 10) {
            System.out.println("청소년");
        } else {
            System.out.println("소인");
        }
    }
} // <--- 여기서 Person 클래스가 완전히 닫혀야 합니다.

public class Text1 {
    public static void main(String[] args) {
        Person a = new Person("john", 19);
        a.checkAdult();
    }
}