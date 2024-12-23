package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<Integer> numberList3 = null;

        numberList2 = new ArrayList<>();

//        // for문
//        for(int i =0; i<numberList.size(); i++){
//            numberList2.add(numberList.get(i) * 10);
//        }
//
        // 향상된 for문
        for (Integer number : numberList) {
            numberList2.add(number * 10);
        }

        numberList3 = numberList.stream()
                .map(num -> num * 10)
                .collect(Collectors.toList());

        numberList.stream()
            .map(num -> num * 10)
            .collect(Collectors.toList())
            .forEach(System.out::println);





        final List<Integer> numberList4 = new ArrayList<>();
        AtomicReference<Integer> number = new AtomicReference<>(0);

        numberList.forEach(num -> {
            numberList4.add(num);
            number.set(num * 10);
        });

//        numberList.forEach(num -> numberList4.add(num * 10));

        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);

    }
}
