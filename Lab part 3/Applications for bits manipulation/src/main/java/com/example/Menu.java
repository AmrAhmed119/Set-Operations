package main.java.com.example;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static boolean validate(String operation){
        if(Objects.equals(operation, "1") || Objects.equals(operation, "2") || Objects.equals(operation, "3"))
        {
            return true;
        }
        return false;
    }

    public static String menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 : Get single ocuurence of a number");
        System.out.println("2 : Number of set bits ");
        System.out.println("3 : Exit ");
        System.out.print("Enter the number of a function you want : ");
        String operation;
        operation = scan.nextLine();
        while(!validate(operation))
        {
            System.out.print("please choose correct number : ");
            operation = scan.nextLine();
        }
        if(Objects.equals(operation, "3"))
            System.exit(0);
        return operation;
    }
}
