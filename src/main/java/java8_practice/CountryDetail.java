package java8_practice;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public enum CountryDetail {

    AMERICAS(1,"American","DELL","AMER"),
    JAPANESE(2,"Japan","DELL","JAP"),
    AP(3,"Australia","DELL","AP"),
    INDIA(4,"India","DELL","IND"),
    EUROPE(5,"Europe","EMC","EMEA");
    ;

    private Integer id;
    private String name;
    private String manufacturer;
    private String region;

    public static List<Integer> getcounIdbyManufacturer(String manufacturer){
        return Arrays.stream(values())
                .filter(v -> v.manufacturer.equalsIgnoreCase(manufacturer))
                .map(CountryDetail::getId)
                .toList();
    }

    public static Map<Integer,String> counIdbyManufacturer(String manufacturer){
        Map<Integer,String> result = new LinkedHashMap<Integer,String>();
        return Arrays.stream(values())
                .filter(v -> v.getManufacturer().equalsIgnoreCase(manufacturer) && !manufacturer.isEmpty() )
                 .collect(Collectors.toMap(CountryDetail::getId, CountryDetail::getName));
//                .forEach(v -> result.put(v.getId(),v.getName()));
//         return result;

    }
}

class Demo{
    public static void main(String[] args) {
//        CountryDetail.getcounIdbyManufacturer("DELL");
        Map<Integer, String> dell = CountryDetail.counIdbyManufacturer("EMc");
        System.out.println(dell);
    }
}

