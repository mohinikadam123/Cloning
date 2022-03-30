package Array;

import java.util.Arrays;

public class AverageOfArray {
	public static void main(String[] args)
	{
		int[] arr={20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		for(int i = 0;i<arr.length-1;i++)
		{
			sum=sum+i;
        }
		System.out.println("the sum is="+Arrays.toString(arr));
		double average=sum/arr.length;
		System.out.println("the average of sum is="+average);
	}

}
