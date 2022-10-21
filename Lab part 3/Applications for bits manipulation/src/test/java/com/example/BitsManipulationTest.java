package test.java.com.example;

import main.java.com.example.BitsManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitsManipulationTest {

    @Test
    void singleOcurrence1() {

        BitsManipulation op = new BitsManipulation();
        int[] arr = {5, 7, 9 ,10 , 11, 9, 7, 5, 10};
        int result = op.singleOcurrence(arr);
        Assertions.assertEquals(result,11);

    }

    @Test
    void singleOcurrence2() {

        BitsManipulation op = new BitsManipulation();
        int[] arr = {5, 7, 9 ,10 , 11, 9, 7, 5, 10};
        int result = op.singleOcurrence(arr);
        Assertions.assertEquals(result,11);

    }

    @Test
    void singleOcurrence3() {

        BitsManipulation op = new BitsManipulation();
        int[] arr = {5, 7, 9 ,10 , 11, 9, 7, 5, 10, 1, 0, 19, 45, 13, 13, 78, 78, 19, 45, 0, 1, 11, 100};
        int result = op.singleOcurrence(arr);
        Assertions.assertEquals(result,100);

    }

    @Test
    void singleOcurrence4() {

        BitsManipulation op = new BitsManipulation();
        int[] arr = {1, 1, 1 ,1 , 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 11, 11, 11, 11};
        int result = op.singleOcurrence(arr);
        Assertions.assertEquals(result,0);

    }

    @Test
    void numOfBits1() {

        BitsManipulation op = new BitsManipulation();
        int result = op.NumOfBits(1073741823);
        Assertions.assertEquals(result,30);

    }

    @Test
    void numOfBits2() {

        BitsManipulation op = new BitsManipulation();
        int result = op.NumOfBits(16);
        Assertions.assertEquals(result,1);

    }

    @Test
    void numOfBits3() {

        BitsManipulation op = new BitsManipulation();
        int result = op.NumOfBits(1023);
        Assertions.assertEquals(result,10);

    }

    @Test
    void numOfBits4() {

        BitsManipulation op = new BitsManipulation();
        int result = op.NumOfBits(1241736124);
        Assertions.assertEquals(result,14);

    }
}