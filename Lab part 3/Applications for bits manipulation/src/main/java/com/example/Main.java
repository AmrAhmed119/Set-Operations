package main.java.com.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while(true) {
            int res = CommandFactory.create_command(Menu.menu());
            System.out.println("The result equal : " + res);
        }
    }
}
