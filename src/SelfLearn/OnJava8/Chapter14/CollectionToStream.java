package SelfLearn.OnJava8.Chapter14;

import java.util.*;

/**
 * Class CollectionToStream is created on 2020/1/4 16:37.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles.stream().mapToInt(b -> b.num).sum());

        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
    }
}