package main.java.com.example;

import java.util.*;

public class Menu {

    static BitOperations op = new BitOperations();
    static Scanner scan = new Scanner(System.in);

    public static String[] getUniverse() {
        return universe;
    }
    public static int[] getSets() {
        return sets;
    }

    public static String[] universe;
    public static int[] sets;



    public static boolean validate(String operation){
        if(Objects.equals(operation, "1") || Objects.equals(operation, "2") || Objects.equals(operation, "3")|| Objects.equals(operation, "4"))
        {
            return true;
        }
        return false;
    }

    public static int hashing_set(String[]universe,String[]arr){
        int num=0;
        for(int j=0;j<arr.length;j++) {
            for(int k=0;k<universe.length;k++){
                if(Objects.equals(universe[k], arr[j])){
                    num = op.setBit(num,universe.length-1-k);
                    break;
                }
            }
        }
        return num;
    }

    public static void setvalues(){
        int setNum = 0;
        System.out.print("Enter the Universe: ");
        universe = scan.nextLine().split(" ");
        Arrays.sort(universe);

        System.out.print("Enter the number of the sets: ");
        setNum = scan.nextInt();
        scan.nextLine();

        sets = new int[setNum];

        for(int i=0;i<setNum;i++){
            System.out.print("Enter the values of set " + (i+1) + ": ");
            String[] arr = scan.nextLine().split(" ");
            Arrays.sort(arr);
            sets[i] = hashing_set(universe,arr);
        }
    }

    public static String menu(){
        System.out.println();
        System.out.println("1 : Union of two sets ");
        System.out.println("2 : Intersection of two sets ");
        System.out.println("3 : Complement of a set ");
        System.out.println("4 : exit ");
        System.out.print("Enter the number of a function you want : ");
        String operation;
        operation = scan.nextLine();
        while(!validate(operation))
        {
            System.out.print("please choose correct number : ");
            operation = scan.nextLine();
        }
        if(Objects.equals(operation, "4"))
            System.exit(0);
        return operation;
    }
}
