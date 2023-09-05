package basecode.jsonconversion;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParsing {
    public static void main(String[] args)  {
        Employer employer = new Employer("Anish","Bangalore",new String[]{"Java","Spring","SpringBoot"},123);
        try {
            ObjectMapper mapper = new ObjectMapper();

              //From Object to Json
//            String payload;
//            mapper.writeValue(new File("target/employer.json"), employer);
//
//            payload = mapper.writeValueAsString(employer);
//
//            System.out.println(payload);

            //From Json to Object
            String empJson ="{\"name\":\"Anish\",\"location\":\"Bangalore\",\"skills\":[\"Java\",\"Spring\",\"SpringBoot\"],\"empId\":123}";
            Employer employer1 = mapper.readValue(empJson,Employer.class);
            System.out.println(employer1.toString());

            System.out.println("=====================================");

            //From JSON Node
            JsonNode jsonNode = mapper.readTree(empJson);

            jsonNode.forEach(jsonNode1 -> {
                System.out.println(jsonNode1.asText());
            });



        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
