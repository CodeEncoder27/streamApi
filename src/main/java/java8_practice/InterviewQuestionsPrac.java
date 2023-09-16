package java8_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQuestionsPrac {

    public static void main(String[] args) {
        //Q1 removing dups from String
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("A");
        strings.add("y");
        strings.add("r");
        strings.add("A");
        strings.add("Y");

        List<String> duplicateWithout  = strings.stream().distinct().collect(Collectors.toList());

        System.out.println("Without Dups " + duplicateWithout + "\n" + "Count " + strings.size());
    }
}
