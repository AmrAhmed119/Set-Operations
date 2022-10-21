package main.java.com.example;

import java.util.Objects;
import java.util.Scanner;

public class CommandFactory {
    public static int create_command(String operation){
        BitsManipulation op = new  BitsManipulation();
        Scanner scan = new Scanner(System.in);
        if(Objects.equals(operation, "1")){
            System.out.print("Enter the size of the array : ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array :");
            for (int i=0;i<n;i++){
                arr[i]= scan.nextInt();
            }
            return op.singleOcurrence(arr);
        }
        else if(Objects.equals(operation, "2")){
            int number;
            System.out.print("Enter the number: ");
            number = scan.nextInt();
            return op.NumOfBits(number);
        }
        return 1;
    }
}
