package main.java.com.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static ArrayList<String> convert(int res , String[]universe) {
        ArrayList<String> arr = new ArrayList<>();
        BitOperations op = new BitOperations();
        for(int i=0;i<universe.length;i++){
            if(op.getBit(res,universe.length-1-i) == 1){
                arr.add(universe[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Menu.setvalues();
        while(true) {
            int res = CommandFactory.create_command(Menu.menu());
            ArrayList<String> ans = convert(res,Menu.getUniverse());
            System.out.print("The result of the operation: ");
            System.out.println();
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}
