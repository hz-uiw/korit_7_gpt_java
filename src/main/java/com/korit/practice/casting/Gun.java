package com.korit.practice.casting;


public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("땅땅땅빵!");
    }

    public void reload() {
        System.out.println("장전!");
    }
}
