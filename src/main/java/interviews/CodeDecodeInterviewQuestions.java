package interviews;

import lombok.Getter;

public class CodeDecodeInterviewQuestions {
    public static void main(String[] args) {


        try {
            System.out.println("CodeDecodeInterviewQuestions");
            throw new Exception("CodeDecodeInterviewQuestions");
        } catch (Exception e) {
            System.out.println(e.getMessage()+ e.getStackTrace());
        } finally {
            System.out.println("Finaallty exedcuted ");
        }

        try{
            System.out.println("1");
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("2");
            return;
        } finally {
            System.out.println("3");
        }

    }
}

final class Immutabblke {

   @Getter
   private String anime = "Naruto Shippuden";

   @Getter
   private int duration = 720;



}