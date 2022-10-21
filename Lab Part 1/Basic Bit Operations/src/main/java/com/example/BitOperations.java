package main.java.com.example;

public class  BitOperations implements IOperations {

    @Override
    public int getBit(int number, int position) {

        int bit = 0;
        int val = (1 << position) & number; // 1011000
        if (val > 0) {
            bit = 1;
        }
        return bit;

    }

    @Override
    public int setBit(int number, int position) {

        number |= (1 << position);
        return number;

    }

    @Override
    public int clearBit(int number, int position) {

        number &= ~(1 << position);
        return number;

    }

    @Override
    public int updateBit(int number, int position, boolean value) {

        if (value) {
            number = setBit(number, position);
        }

        else {
            number = clearBit(number, position);
        }
        return number;

    }
}
