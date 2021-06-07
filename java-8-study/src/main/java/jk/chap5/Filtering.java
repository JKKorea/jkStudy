package jk.chap5;

import jk.chap4.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static jk.chap4.Dish.menu;

public class Filtering{

    public static void main(String...args){

        // Filtering with predicate
        List<Dish> vegetarianMenu =
            menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        vegetarianMenu.forEach(System.out::println);

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0) // 짝수
               .distinct()
               .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList());

        dishesLimit3.forEach(System.out::println);

        List<Dish> dishesSortedLimit3 =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(comparing(Dish::getCalories))
                .limit(3)
                .collect(toList());

        dishesSortedLimit3.forEach(System.out::println);

        System.out.println("===================");

        List<Dish> dishesNoSkip =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .collect(toList());

        dishesNoSkip.forEach(System.out::println);
        System.out.println("===================");

        // Skipping elements
        List<Dish> dishesSkip2 =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList());

        dishesSkip2.forEach(System.out::println);
    }
}
