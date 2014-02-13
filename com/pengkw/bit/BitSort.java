package com.pengkw.bit;

public class BitSort {
	
	public static void main(String[] args) {
		int[] arr = new int[]{2,5,3,1,4};
		Bit bit = new Bit(5);
		for(int i = 0; i < arr.length; i++) {
			bit.set(arr[i]);
		}
		
		bit.display();
	}
}

