package com.korit.main;


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 {


    public static void main(String[] args) {
//        ForEachPrinter2<Integer> ifp = new ForEachPrinter2<>(); // new ForEachPrinter2<>();에 <>안에 자료형 생략 가능
//        new ForEachPrinter2<>();  // 아무것도 명시하지 않으면 <Object>

        String[] names = new String[] {"a", "b", "c"};
        Integer[] numbers = new Integer[] {1, 2, 3};
        List<String> datas = ForEachPrinter2.print(Arrays.asList(names), data -> System.out.println(data));

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().collect(Collectors.toList()); // 다른 list를 생성하지 않는 방식
        List<Integer> list2 = new ArrayList<>(); // 새 list 객체를 만드는 방식
        list2.addAll(list);
        list2.add(10);

    }
}
