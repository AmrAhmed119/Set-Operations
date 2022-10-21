package main.java.com.example;

import java.util.Objects;
import java.util.Scanner;

public class CommandFactory {
    public static int create_command(String operation){
        BitOperations op = new  BitOperations();
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = scan.nextInt();
        System.out.print("enter the position: ");
        int position = scan.nextInt();
        if(Objects.equals(operation, "1")){
            return op.getBit(number,position);
        }
        else if(Objects.equals(operation, "2")){
            return op.setBit(number,position);
        }
        else if(Objects.equals(operation, "3")){
            return op.clearBit(number,position);
        }
        else if(Objects.equals(operation, "4")){
            System.out.print("enter the value (true or false) : ");
            boolean value = scan.nextBoolean();
            return op.updateBit(number,position,value);
        }
         return 1;
    }
}
