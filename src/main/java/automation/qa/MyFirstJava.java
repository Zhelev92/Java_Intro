package automation.qa;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstJava {

    public static void main(String[] args) {
        //writes the text in the console
        System.out.println("Please enter your first name");
        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);
        //a string variable that will store the value entered from the user
        String firstname = scanner.next();

        //System.out.println("Your name is: " + firstname);

        System.out.println("Please enter your age:");
        //integer variable that will store the age entered from the user
        int userAge = scanner.nextInt();

        System.out.println("Your name is: " + firstname +
                ". Your age is: " + userAge);

        if (userAge >= 18){
            System.out.println(firstname + " can buy alcohol!!!");
        }

        if (userAge < 18){
            System.out.println(firstname + " can't buy drink!!!");
        }

        if (userAge >= 65){
            System.out.println(firstname + " is retired");
        }
    }

}
