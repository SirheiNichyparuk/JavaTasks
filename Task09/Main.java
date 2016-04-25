package Task09;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		double[] array1 = { 1, 2, 3, 4, 5, 6 };
		double[] array2 = { 10, 20, 30, 40 };
		int k = 5;
		ArrayClass ac = new ArrayClass();
		System.out.println("Result array:");
		ac.printArray(ac.joinArrays(array1, array2, k));
	}
}
