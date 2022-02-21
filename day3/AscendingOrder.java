package week1.day3;

import java.util.Arrays;

public class AscendingOrder {
public static void main(String[]args) {
	int[] value= {3,5,4,1,2};
	Arrays.sort(value);
	for (int i = value.length-1; i>=0; i--) {
		System.out.println(value[i]);
		
	}
}
}
