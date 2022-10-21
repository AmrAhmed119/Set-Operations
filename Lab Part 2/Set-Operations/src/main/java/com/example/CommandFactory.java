package main.java.com.example;

import java.util.Objects;
import java.util.Scanner;

public class CommandFactory{

    public static int create_command(String operation){
        int set[] = Menu.getSets();
        Scanner scan = new Scanner(System.in);
        BitOperations op = new BitOperations();
        int set1 = 0, set2 = 0;
        System.out.print("Enter the number of the first set: ");
        set1 = scan.nextInt();
        set1--;
        if(Objects.equals(operation, "1")){
            System.out.print("Enter the number of the second set: ");
            set2 = scan.nextInt();
            set2--;
           return op.Union(set[set1],set[set2]);
        }
        else if(Objects.equals(operation, "2")){
            System.out.print("Enter the number of the secong set: ");
            set2 = scan.nextInt();
            set2--;
            return op.Intersection(set[set1],set[set2]);
        }
        else if(Objects.equals(operation, "3")){
            return op.Complement(set[set1]);
        }

         return 1;
    }
}
