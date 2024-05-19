package collectionspractice;

import java.util.*;
import java.util.stream.Collectors;

public class GenericsTyp<T extends Number> {

    T value;
    public GenericsTyp(T va){
        this.value = va;
    }

    public T  getValue(){
        return value;
    }
}

class TestGenerics {
    public static void main(String[] args) {
        GenericsTyp<Double> gen = new GenericsTyp<>(78.9);
        System.out.println(gen.getValue());

        List<String> v = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> upperCase = new ArrayList<String>();
        for (String v1 : v) {
            upperCase.add(v1.toUpperCase());
        }
        System.out.println(upperCase);

        String collect = v.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(collect);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13);
        System.out.println(numbers.stream().filter(i -> i % 2 == 0).count());

        Integer[] mn = new Integer[5];
        mn[0] = 1;
        mn[1] = 2;
        mn[2] = 3;
        mn[3] = 4;
        mn[4] = 5;
        System.out.println(Arrays.toString(mn));


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(mn));
        list.forEach(System.out::println);
        System.out.println(" | " + Collections.frequency(numbers, 6));

        try {
            System.out.println("--------------------------------");
//            System.exit(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Executed " + System.currentTimeMillis());
        }

    }
}