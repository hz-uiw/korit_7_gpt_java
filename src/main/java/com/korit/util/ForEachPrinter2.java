package com.korit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// 제네릭을 쓰는 이유:
// 제네릭<T>를 사용하지 않고 Object로 받을 수 있지만 업캐스팅과 다운캐스팅을 해야하므로 제네릭 사용

public class ForEachPrinter2 {

    public static <T> List<T> print(List<T> datas, Consumer<List<T>> action) { // static일 때 제네릭 사용법: 반환타입 앞에 제네릭 명시
        List<T> result = new ArrayList<T>();
        action.accept(datas);
        return result;
    }
}
