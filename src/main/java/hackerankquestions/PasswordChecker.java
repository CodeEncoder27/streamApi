package hackerankquestions;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Code@123";
        Scanner csc = new Scanner(System.in);
        System.out.println("Enter the Password ");

//        password = csc.nextLine();
//
//
//        if (password.contains(" ")) {
//            System.out.println("invalid password");
//            return;
//        }

        boolean isLength = password.length() >= 8 ;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase= true;
            } else if (Character.isDigit(ch)) {
                hasDigit= true;
            } else
                hasSpecialChar= true;
        }

        boolean StrongPassword = (isLength && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar);

        if (StrongPassword) {
            System.out.println("strong password" +  password);
        } else{
            System.out.println("weak password");
        }


        }




    }

