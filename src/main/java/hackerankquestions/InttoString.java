package hackerankquestions;

import java.util.Scanner;

public class InttoString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String s = Integer.toString(a);
            System.out.println("Good job!!!!!!!");
        } catch (Exception e) {
            System.out.println("not good enough");
        }

    }
}
