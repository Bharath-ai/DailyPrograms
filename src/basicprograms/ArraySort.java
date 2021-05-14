package basicprograms;

import java.util.ArrayList;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[] {17,19,23,29,56};
		int temp = values[0];
		boolean flag = false;
		for(int i=1; i<values.length; i++)
		{
			if(values[i]>temp)
			{
				temp = values[i];
			}
			else
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
		
		

	}

}
