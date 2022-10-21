package main.java.com.example;

public interface IOperations {

    /**
     * @param number entered by the user
     * @param position of the bit
     * @return the number after getting a bit at certain position
     */
    int getBit(int number, int position);

    /**
     * @param number entered by the user
     * @param position of the bit
     * @return the number after setting a bit at certain position
     */
    int setBit(int number, int position);

    /**
     * @param number entered by the user
     * @param position of the bit
     * @return the number after setting a bit at certain position
     */
    int clearBit(int number, int position);

    /**
     * @param number entered by the user
     * @param position of the bit
     * @param value indicate set or clear of a bit
     * @return the number after updating a bit with certain value
     */
    int updateBit(int number, int position, boolean value);

    /**
     * @param num1
     * @param num2
     * @return
     */
    int Union(int num1,int num2);

    /**
     * @param num1
     * @param num2
     * @return the union
     */
    int Intersection(int num1,int num2);

    /**
     * @param num1
     * @return the intersection
     */
    int Complement(int num1);

}
