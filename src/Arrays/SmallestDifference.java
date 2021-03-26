package Arrays;

import java.util.Arrays;

public class SmallestDifference {
	
	//TC - O(M LogM+ N LogN) SC - O(1)
	public int[] getSmallestDiff1(int []a, int []b)
	{
		int i = 0 , j = 0, minDiff = Integer.MAX_VALUE;
		Arrays.sort(a);
		Arrays.sort(b);
		int[] res = new int[2];
		
		while(i < a.length && j < a.length)
		{
			if(Math.abs(a[i] - b[j]) < minDiff)
			{
				minDiff = Math.abs(a[i] - b[j]);
				res[0] = a[i];
				res[1] = b[j];
			}
			
			if(a[i] < b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		return res;
	}
	
	//TC - O(N^2) SC - O(1)
	public int[] getSmallestDiff(int[] a, int[] b)
	{
		int smallestDiff = Integer.MAX_VALUE;
		int[] res = new int[2];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(Math.abs(a[i]- b[j]) < smallestDiff)
				{
					smallestDiff = Math.abs(a[i]- b[i]);
					res[0] = a[i];
					res[1] = b[j];
				}
			}
		}
		return res;
	}
	
	public static void main(String []args)
	{
		int[] a = {-1, 5, 10, 20, 28, 3};
		int []b = {26, 134, 135, 15, 17};
		
		SmallestDifference s = new SmallestDifference();
		int[] res = s.getSmallestDiff1(a, b);
		System.out.println(res[0]);
		System.out.println(res[1]);
		
		
	}
}
