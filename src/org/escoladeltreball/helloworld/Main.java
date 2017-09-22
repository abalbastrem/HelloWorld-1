/**
 * 
 */
package org.escoladeltreball.helloworld;
import java.util.*;

/**
 * @author jmendez
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//
		int[] v = { 1,2,3,5,6 };
		Main main = new Main();
		System.out.println(Arrays.toString(main.merge(v,4)));
//		System.out.println(main.findSmallest(v));
	}

	/*
	 * (non-Javadoc) This methods returns the smallest value from values
	 * 
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		int temp = values[0];
		for (int value : values) {
			if (value < temp) {
				temp = value;
			}
		}
		return temp;
	}

	@Override
	public int sum(int[] values) {
		int temp = 0;
		for (int value : values) {
			temp += value;
		}
		return temp;
	}

	@Override
	public int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}

	@Override
	public double frequencyPercentage(int[] values, int n) {
		return ((double) frequency(values, n)) / values.length * 100;
	}
	
	@Override
	public boolean isPresent(int[] values, int n) {
		for (int value: values) {
			if (value == n) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int[] merge(int[] values, int n) {
		int j = values[values.length-1];
		ArrayList ovalues = new ArrayList(values.length+1);
		for (int i = 0; i < values.length-1; i++) {
			if (n > values[i] && n < values[i+1]) {
				ovalues.add(n);
			} else {
				ovalues.add(values[i]);
			}
		}
		return ovalues.toArray();
		
	}


}
