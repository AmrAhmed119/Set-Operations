package test.java.com.example;

import main.java.com.example.BitOperations;
import main.java.com.example.Main;
import main.java.com.example.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;

class BitOperationsTest {

	@Test
	void UnionTest_1() {

		BitOperations op = new BitOperations();
		String[] universe = {"1", "2", "3", "4", "5","6"};
		String[] s1 = {"2","5","6"};
		String[] s2 = {"1","4","5","6"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Union(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("1", "2", "4", "5", "6")));

	}

	@Test
	void UnionTest_2() {

		BitOperations op = new BitOperations();
		String[] universe = {"Amr", "Belal", "Hussien", "Kareem", "Mohamed"};
		String[] s1 = {"Amr","Hussien","Mohamed"};
		String[] s2 = {"Belal","Kareem"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Union(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("Amr", "Belal", "Hussien", "Kareem", "Mohamed")));

	}

	@Test
	void UnionTest_3() {

		BitOperations op = new BitOperations();
		String[] universe = {"1", "2", "3", "4", "5","6"};
		String[] s1 = {"2","5","6"};
		String[] s2 = {"2","5","6"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Union(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("2","5","6")));

	}

	@Test
	void IntersectionTest_1() {

		BitOperations op = new BitOperations();
		String[] universe = {"1", "2", "3", "4", "5","6"};
		String[] s1 = {"2","5","6"};
		String[] s2 = {"1","4","5","6"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Intersection(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("5", "6")));

	}

	@Test
	void IntersectionTest_2() {

		BitOperations op = new BitOperations();
		String[] universe = {"1", "2", "3", "4", "5","6"};
		String[] s1 = {"2","5","6"};
		String[] s2 = {"1"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Intersection(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList()));

	}

	@Test
	void IntersectionTest_3() {

		BitOperations op = new BitOperations();
		String[] universe = {"Amr", "Belal", "Hussien", "Kareem", "Mohamed"};
		String[] s1 = {"Amr","Hussien","Mohamed"};
		String[] s2 = {"Amr","Belal","Kareem"};
		int set1 = Menu.hashing_set(universe,s1) , set2 = Menu.hashing_set(universe,s2);
		int res = op.Intersection(set1,set2);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("Amr")));

	}

	@Test
	void  Complement_1() {

		BitOperations op = new BitOperations();
		String[] universe = {"Amr", "Belal", "Hussien", "Kareem", "Mohamed"};
		String[] s1 = {"Hussien","Mohamed"};
		int set1 = Menu.hashing_set(universe,s1);
		int res = op.Complement(set1);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("Amr", "Belal","Kareem")));

	}

	@Test
	void  Complement_2() {

		BitOperations op = new BitOperations();
		String[] universe = {"1", "2", "3", "4", "5","6","7","8","9","10"};
		String[] s1 = {"5","1","2"};
		int set1 = Menu.hashing_set(universe,s1);
		int res = op.Complement(set1);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("3", "4","6","7","8","9","10")));

	}

	@Test
	void  Complement_3() {

		BitOperations op = new BitOperations();
		String[] universe = {"11", "12", "13", "14", "15","16","17","18"};
		String[] s1 = {"12","14","16","18"};
		int set1 = Menu.hashing_set(universe,s1);
		int res = op.Complement(set1);
		ArrayList<String> arr = Main.convert(res,universe);
		Assertions.assertEquals(arr, new ArrayList<String>(Arrays.asList("11","13","15","17")));

	}
}
