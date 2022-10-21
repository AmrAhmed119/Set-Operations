package main.java.com.example;

import com.google.common.base.Strings;

import java.util.Scanner;

public class BitsManipulation {


    public int singleOcurrence(int[] arr){

        int res = 0;
        for(int i=0;i<arr.length;i++){
            res ^= arr[i];
        }
        return res;

    }

    public int NumOfBits(int number){

        int cnt = 0;
        while(number > 0){
            cnt += (number & 1);
            number >>= 1;
        }
        return cnt;

    }

}
