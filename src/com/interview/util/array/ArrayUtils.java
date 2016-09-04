package com.interview.util.array;

import java.util.Random;

public class ArrayUtils {

	public static int[] getPrePopulatedIntegerArray(int size,Long seed){

		int[] arr = new int[size];

		if(seed == null)
			seed = 1000L;

		Random generator = new Random(seed);

		for(int i = 0;i<size;i++){			
			arr[i] = generator.nextInt();			
		}

		return arr;
	}





}
