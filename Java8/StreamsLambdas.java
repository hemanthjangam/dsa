package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamsLambdas {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        int max = list.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        list.forEach(System.out::print);
        List<String> strings = Arrays.asList( "Hemanth","Bunny", "Soldier", "Anushka", "Adi");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        strings.stream().sorted().forEach(System.out::println);
        List<String> newStr = strings.stream()
                .filter(str -> str.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        list.removeIf(n -> n % 2 != 0);

    }
}
