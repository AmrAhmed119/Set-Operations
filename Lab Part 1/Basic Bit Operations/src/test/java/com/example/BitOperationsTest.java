package test.java.com.example;

import main.java.com.example.BitOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitOperationsTest {

	@Test
		// Test getBit Function
	void getBit1() {

		BitOperations operation = new BitOperations();
		int result = operation.getBit(8,100);
		Assertions.assertEquals(result,0);

	}

	@Test
		// Test getBit Function
	void getBit2() {

		BitOperations operation = new BitOperations();
		int result = operation.getBit(31,4);
		Assertions.assertEquals(result,1);

	}

	@Test
		// Test getBit Function
	void getBit3() {

		BitOperations operation = new BitOperations();
		int result = operation.getBit(9,0);
		Assertions.assertEquals(result,1);

	}

	@Test
		// Test getBit Function
	void getBit4() {

		BitOperations operation = new BitOperations();
		int result = operation.getBit(23,3);
		Assertions.assertEquals(result,0);

	}

	@Test
		// Test setBit Function
	void setBit1() {

		BitOperations operation = new BitOperations();
		int result = operation.setBit(17,2);
		Assertions.assertEquals(result,21);

	}

	@Test
		// Test setBit Function
	void setBit2() {

		BitOperations operation = new BitOperations();
		int result = operation.setBit(0,0);
		Assertions.assertEquals(result,1);

	}

	@Test
		// Test setBit Function
	void setBit3() {

		BitOperations operation = new BitOperations();
		int result = operation.setBit(27,2);
		Assertions.assertEquals(result,31);

	}

	@Test
		// Test setBit Function
	void setBit4() {

		BitOperations operation = new BitOperations();
		int result = operation.setBit(0,30);
		Assertions.assertEquals(result,1073741824);

	}

	@Test
		// Test Clear Function
	void clearBit1() {

		BitOperations operation = new BitOperations();
		int result = operation.clearBit(31,0);
		Assertions.assertEquals(result,30);

	}

	@Test
		// Test Clear Function
	void clearBit2() {

		BitOperations operation = new BitOperations();
		int result = operation.clearBit(370,8);
		Assertions.assertEquals(result,114);

	}

	@Test
		// Test Clear Function
	void clearBit3() {

		BitOperations operation = new BitOperations();
		int result = operation.clearBit(27,2);
		Assertions.assertEquals(result,27);

	}

	@Test
		// Test Clear Function
	void clearBit4() {

		BitOperations operation = new BitOperations();
		int result = operation.clearBit(1,0);
		Assertions.assertEquals(result,0);

	}

	@Test
		// Test updateBit Function
	void updateBit1() {

		BitOperations operation = new BitOperations();
		int result = operation.updateBit(114,3,true);
		Assertions.assertEquals(result,122);

	}

	@Test
		// Test updateBit Function
	void updateBit2() {

		BitOperations operation = new BitOperations();
		int result = operation.updateBit(114,6,false);
		Assertions.assertEquals(result,50);

	}

	@Test
		// Test updateBit Function
	void updateBit3() {

		BitOperations operation = new BitOperations();
		int result = operation.updateBit(0,16,true);
		Assertions.assertEquals(result,65536);

	}

	@Test
		// Test updateBit Function
	void updateBit4() {

		BitOperations operation = new BitOperations();
		int result = operation.updateBit(1024,6,false);
		Assertions.assertEquals(result,1024);

	}

}
