package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        for (String v1: v) {
            upperCase.add(v1.toUpperCase());
        }
        System.out.println(upperCase);

        String collect = v.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(collect);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        System.out.println(numbers.stream().filter(i -> i%2 == 0).count());

        int [] mn = new int[5];
        mn[0] = 1;
        mn[1] = 2;
        mn[2] = 3;
        mn[3] = 4;
        mn[4] = 5;

        for(int i: mn){
            System.out.println(i);
        }

    }
}