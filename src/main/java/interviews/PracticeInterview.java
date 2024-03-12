package interviews;

import basecode.Employee;
import java8_practice.CorporateEmployees;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class PracticeInterview {

    static List<CorporateEmployees> corporateEmployees = new ArrayList<>();
    static {
        corporateEmployees.add(new CorporateEmployees("1","Anish","Pune",50000.0,"C","SALES",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("2","Vikram","Mumbai",2000000.0,"B","SALES",List.of("KAFKA","OMEGA")));
        corporateEmployees.add(new CorporateEmployees("3","Ranjith","Bangalore",3000647.0,"B","SALES",List.of("DELTA","PROJECT_X")));
        corporateEmployees.add(new CorporateEmployees("4","Karan","Chennai",4004040.0,"A","HR",List.of("SPLUNK","Hp")));
        corporateEmployees.add(new CorporateEmployees("5","Ravi","Pune",5560670.0,"A","HR",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("6","Kabir","Mumbai",6067000.0,"A+","DEV",List.of("KAFKA","OMEGA")));
        corporateEmployees.add(new CorporateEmployees("7","Karunya","Mumbai",6069000.0,"A+","DEV",List.of("random","OMEGA")));
        corporateEmployees.add(new CorporateEmployees("8","varsha","Mumbai",6067000.0,"A+","QA",List.of("pli","OMEGA")));

    }
    public static void main(String[] args) {
        //Finding duplicate elements in list using java 8
        List<String> v = Arrays.asList("Pune","Mumbai","Delhi","Pune","Bangalore","Mumbai","Pune");
        //Using set to get the duplicates
        Set<String> UniqueValues = new HashSet<>();
        Set<String> duplicates = v.stream().filter(i -> !UniqueValues.add(i)).collect(Collectors.toSet());
        duplicates.stream().forEach(System.out::println);

        //Using Map to get the count of duplicate literal

        Map<String,Long> dupMap = v.stream().collect(groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("***********************************************");
        System.out.println(dupMap);
//        dupMap.entrySet().stream().forEach(System.out::println);

//        double AbsoluteIncrease = corporateEmployees.stream().map(i -> i.getEmpSalary() * 10.0 / 100).mapToDouble(i -> i).;
//        double newSal = corporateEmployees.stream().map(i -> i.getEmpSalary() * 10.0 / 100).count() + AbsoluteIncrease;

        //for the given employee who's Grade is C apply hike percent of 10
        List<CorporateEmployees> updatedSalary = corporateEmployees.stream().filter(corporateEmployees1 -> corporateEmployees1.getEmpGrade().equals("C"))
                .map(e -> new CorporateEmployees(
                        e.getEmpId(), e.getEmpName(), e.getEmpLocation(), e.getEmpSalary() * 0.50, e.getEmpGrade(), e.getEmpProjects()
                )).collect(Collectors.toList());
        System.out.println("Updated After Hike " + updatedSalary);

        //Given string array  find  Duplicate Characters from a String and Count
        String in = "loJavaiJava";
        char[] inp = in.toCharArray();
        Map<Character,Integer> charCounter = new HashMap<>();
        for (char keys: inp){
            if(Character.isAlphabetic(keys)) {
                if (charCounter.containsKey(keys)) {
                    charCounter.put(keys, charCounter.get(keys) + 1);
                } else {
                    charCounter.put(keys, 1);
                }
            }
        }
        System.out.println("counted " + charCounter);

        //Given string array  find  Duplicate Characters from a String and Count

        //Given string array  find  char occurenc Characters from a String and Count using java 8
         Map<String,Long> duplicateOu = Arrays.stream(in.split(""))
                                              .collect(groupingBy
                                                                            (Function.identity(),Collectors.counting())
                                                      );
        System.out.println("char occurence: " + duplicateOu);
        //Given string array  find  Duplicate Characters from a String and Count Count using java 8
        List<String>  duplocatElem = duplicateOu.entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("dupl : " + duplocatElem);

        //unique elements
        List<String> uniqueVal =duplicateOu.entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println("unique : " + uniqueVal);
        //unique elements

        // find first non-repeat element
        Map<String,Long> duplicateOu2 = Arrays.stream(in.split(""))
                .collect(groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println("--------------------------------" + duplicateOu2);

        String nonrepeatVal = duplicateOu2.entrySet().stream().filter(i -> i.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("non repeat : " + nonrepeatVal);
        // find first non-repeat element
        //Given string array  find  Duplicate Characters from a String and Count Count using java 8


        //Given string array  find  char occurenc from a String and Count Count using java 8



        //Vowel count using streams
        String ip = "tcsinterview";
        long count = 0;
       count = ip.chars().filter(i -> i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u').count();


       //java program to find second highest num in an array
        int[] input = {5,9,11,7,21,0,3};
        Integer secondHighest = Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        //java program to find longest string in an array
        String[] strinp = {"Java","microservices","Angular","react"};
       String longestString = Arrays.stream(strinp).reduce((w1,w2)  -> w1.length() > w2.length() ? w1 : w2 ).get();
        System.out.println(longestString);

        //
        String inputs = "I have a sentence with technical words";
        Map<Integer ,List<String>> s= Arrays.stream(inputs.split(" ")).collect(groupingBy(String::length));
        System.out.println( "identity " + s);

        String a = Arrays.stream(inputs.split(" ")).reduce((w1,w2)  -> w1.length() > w2.length() ? w1 : w2 ).get();
        System.out.println("A" + a);
        //
        List<Integer> p = Arrays.asList(1,5,8,12,18,19);
       List<String> o = p.stream().map(Objects::toString).filter(i -> i.startsWith("1")).toList();
        System.out.println("output in " + o);
        //
        String str = removeOddIndexCharacters("Geeksforg");
        System.out.println(str);


        System.out.println("hi");
        Employee f = new Employee();
        f.setEmpId(7L);
        f.setFirstName("anish");
        System.out.println("before "+ f);

        Employee f1 = f;
        f1.setFirstName("English");
        System.out.println("shallow copy " + f1);
        System.out.println("after shallow copy" + f);

        //deep copy
        Employee f2 = new Employee();
        f2.setFirstName(f.getFirstName());
        f2.setEmpId(8L);
        System.out.println("deep copy " + f2);
        System.out.println("after deep copy" + f);

        //Object cloning
//		System.out.println("object cloning  " );
//
//		Employee e3 = (Employee) f.clone();
//		e3.setEmpName("Employ");
//		System.out.println(e3);
//		System.out.println(f);

//
//        List<List<String>> requests = new ArrayList<>();
//        List<String> valid_token = new ArrayList<>();
//        List<String> sample_request = List.of("GET http://localhost/easy?valid_token=ehydiyi&id=2e3rt&name=Alex","POST http://localhost/easy?valid_token=ehyd@iyi&id=2e3rt&name=Paul");
//        valid_token.add("ehydiyi");
//        String token = "GET http://localhost/easy?valid_token=ehydiyi&id=2e3rt&name=Alex";
//        requests.add(sample_request);
//
//        requests.forEach(request -> System.out.println("sample input: " + request));
//
//        String[] split = token.split("[?&]",6);
//        for (String splits : split) {
//            System.out.println(splits);
//        }
//        Map<String, String> h = new HashMap<String, String>();



        List<Integer> list
                = Arrays.asList(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34,34,44,44,45,45,46,46,67,67,68,68);
        Set<Integer> duplicateElements = new HashSet<>();

        String k = list.stream().filter(i -> !duplicateElements.add(i)).map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("usign set approach " + k);


        Set<Integer> op = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        System.out.println("using frequency collection" + op);

        Set<Integer> c= list.stream().collect(groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(" " + c) ;

        //
        //find the character having maximum occurences with number? Using java 8;
        String str1="abbcccdddd";

        Arrays.stream(str1.split(""))
                .collect(groupingBy(s1 -> s1, Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue()).ifPresent(i -> {
                    System.out.println("maximum occurences  " + i);
                });
        //find the character having maximum occurences with number? Using java 8;

        //Find the highest salary by department name IT of class Employee? Using java8

//        List<String> collect =
        Map<String, CorporateEmployees> HighestSalByGrade = corporateEmployees.stream()
                .collect(toMap(CorporateEmployees::getEmpGrade, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(CorporateEmployees::getEmpSalary))));
        HighestSalByGrade.entrySet().stream().forEach(ji -> {System.out.println("highest sal by grade " + ji);});

        corporateEmployees.stream().collect(Collectors.groupingBy(CorporateEmployees::getDepartmentName, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(CorporateEmployees::getEmpSalary))));

        //Find the Highest Salary from Employees.
        List<Double> highestSal = corporateEmployees.stream().map(CorporateEmployees::getEmpSalary).sorted(Collections.reverseOrder()).limit(1).toList();
        highestSal.forEach(System.out::println);

        System.out.println("*************?????????????????????????*");
        //Write a java program to find Same salary Employees in Organization using Java 8 Stream API?
        Map<Double, List<CorporateEmployees>> sameSal = corporateEmployees.stream().collect(groupingBy(CorporateEmployees::getEmpSalary,toList()));
        sameSal.entrySet().stream().filter(m -> m.getValue().size() > 1).forEach(System.out::println);
//        for (Map.Entry<Double,List<CorporateEmployees>> ji :sameSal.entrySet()){
//                if (ji.getValue().size() > 1 ){
//                    System.out.println(ji.getKey() + " " + ji.getValue());
//                }
//        }
        //Write a java program to find Same salary Employees in Organization using Java 8 Stream API?
        String d = new String("5");
        System.out.println(10 + 5 + d + 9 + 8);

    }
    static String removeOddIndexCharacters(String s) {

        // Stores the resultant string
        String new_string = "";

        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0)

                // Skip the character
//                continue;

            new_string += s.charAt(i);
        }

        // Return the modified string
        return new_string;
    }
//    static int p() {
//        try {
//            throw new Exception("Unexpected");
//        }
//        catch (Exception e){
//            return 1;
//        }finally
//        {
//            return 17;
//        }
//
//    }


}
