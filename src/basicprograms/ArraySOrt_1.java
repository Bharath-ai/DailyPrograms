package basicprograms;

import java.util.Arrays;

public class ArraySOrt_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {17,14,23,29,56};
		int[] temparray = array;
		Arrays.sort(temparray);
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
			System.out.println(temparray[i]);
			
		}
	}
}
