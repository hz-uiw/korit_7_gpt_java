package com.korit.practice.casting;

public class Robot {
    public static void main(String[] args) {
        Weapon weaponGun = new Gun(); // 업캐스팅
        weaponGun.attack(); // 자식 메서드에 재정의된 메서드 호출
        ((Gun) weaponGun).reload(); // 다운캐스팅 후 자식 클래스에 있는 메서드 호출

        Weapon weaponKnife = new Knife();
        weaponKnife.attack();
    }
}
