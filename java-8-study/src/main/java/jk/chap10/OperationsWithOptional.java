package jk.chap10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class OperationsWithOptional {

    public static void main(String... args) {
        System.out.println(max(of(3), of(5)));
        System.out.println(max(empty(), of(5)));
//        System.out.println(empty().get());

        List<Integer> integers = Arrays.asList(1,2,3);
        // 구조화된(size가 fix 됨.) 리스트를 반환
        System.out.println(integers.size());

        integers.add(4); //java.lang.UnsupportedOperationException 발생!
    }

    public static final Optional<Integer> max(Optional<Integer> i, Optional<Integer> j) {
         return i.flatMap(a -> j.map(b -> Math.max(a, b)));
    }
}
