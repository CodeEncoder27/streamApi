package collectionspractice;

import java.util.*;
import java.util.stream.Collectors;

public class MapsPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer ,String> empIdName  = new HashMap<>();

        empIdName.put(1,"Anish");
        empIdName.put(2,"kal");
        empIdName.put(3,"man");
        empIdName.put(4,"var");
        empIdName.put(5,"alto");
        empIdName.put(6,"swift");

        //Printing Map Keys
        for (Integer keys : empIdName.keySet()) {
            System.out.println(keys);
        }

        //Printing Map values
        for (String name : empIdName.values()) {
            System.out.println(name);
        }
        //finding the size of Map
        Long count  = empIdName.entrySet().stream().count();
        System.out.println("using streams to count(size) " + count);
        //finding the size of Map
        int size = empIdName.entrySet().size();
        System.out.println("using Map.size() to count(size) " + size);

        //sorting in hashmap
//        empIdName.entrySet().stream().sorted((i,y) -> {
//            return i.getValue() - y.getValue();
//        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (i , y) -> i, LinkedHashMap::new));

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        //get ISBN for Book Java
//        System.out.println("enter book name for ISBN code: " );
//        String input  = scanner.nextLine();
//        Optional<String> IsbnCode =  books.entrySet().stream().filter(i -> input.equalsIgnoreCase(i.getValue())).map(Map.Entry::getKey).findFirst();
//        System.out.println( IsbnCode);


    }
}
