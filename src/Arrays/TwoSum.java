package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Given an array of integers nums and an integer target, return indices of the two 
 * numbers such that they add up to target.
 *
 */
public class TwoSum {
	
	/**
	 * Approach 1: Brute Force
	 * TC - O(n ^ 2)		SC- O(1)
	 * 
	 */
	public int[] findNumsWithSumBruteForce(int[] a, int target)
	{
		if(a.length == 0)
			return new int[0];
		
		for(int i = 0; i < a.length-1; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] + a[j] == target)
				{
					return new int[] {i, j};
				}
			}
		}
		
		return new int[0];
	}
	
	/**
	 * Approach 2: Two-pass Hash Table
	 *  TC - O(N)	SC - O(N)
	 * 
	 */
	public int[] findTwoSumTwoPass(int[] a, int target)
	{
		if(a.length == 0)
			return new int[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < a.length; i++)
		{
			map.put(a[i], i);
		}
		
		for(int j = 0; j < a.length ; j++)
		{
			int val = target - a[j];
			if(map.containsKey(val) && map.get(val) != j)
			{
				return new int[] {j, map.get(val)};
			}
		}
			return new int[0];
	}
	
	
	/**
	 * Approach 3: One-pass Hash Table
	 *  TC - O(N)	SC - O(N)
	 * 
	 */
	public int[] findTwoSumOnePass(int[] a, int target)
	{
		if(a.length == 0)
			return new int[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int j = 0; j < a.length ; j++)
		{
			int val = target - a[j];
			if(map.containsKey(val) && map.get(val) != j)
			{
				return new int[] {map.get(val), j};
			}
			map.put(a[j], j);
		}
			return new int[0];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {3,3};
			int target = 6;
			
			TwoSum s = new TwoSum();
			System.out.println("Using Approach 1: Brute Force - ");
			int[] result1 = s.findNumsWithSumBruteForce(nums, target);
			if(result1.length == 0)
				System.out.println("No such pair found");
			else
				System.out.println(result1[0] + ", " + result1[1]);
			
			System.out.println("Approach 2: Two-pass Hash Table - ");
			int[] result2 = s.findTwoSumTwoPass(nums, target);
			if(result2.length == 0)
				System.out.println("No such pair found");
			else
				System.out.println(result2[0] + ", " + result2[1]);
			
			System.out.println("Approach 3: One-pass Hash Table - ");
			int[] result3 = s.findTwoSumOnePass(nums, target);
			if(result3.length == 0)
				System.out.println("No such pair found");
			else
				System.out.println(result3[0] + ", " + result3[1]);
			
	}

}
