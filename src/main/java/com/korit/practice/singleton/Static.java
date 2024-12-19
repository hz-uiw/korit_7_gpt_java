package com.korit.practice.singleton;

/*
    클래스의 변수 또는 메서드를 인스턴스화 없이 호출 가능.
    접근제어자 뒤에 static 키워드 작성

    ex)
    public static int age = 25;
    private static ClassName instance;

    public static ClassName getInstance() {}

 */
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class Static {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2); // 같은 주소값을 가짐
    }
}
