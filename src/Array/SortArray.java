package Array;
import java.util.Arrays;
public class SortArray {
	public static void main(String[] args)
	{
		int[]a1= {123,156,132,157,158,126,128,130};
		System.out.println("original array="+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("sorted array="+Arrays.toString(a1));
		
	}

}
