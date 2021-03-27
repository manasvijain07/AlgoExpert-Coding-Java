package Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each 
 * number sorted in non-decreasing order.
 * 
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 */

public class SortedSquaredArray {
	
	// TC - O(N)	SC - O(N)
	public int[] getSortedSquaredArray(int[] nums)
	{
		int[] res = new int[nums.length];
		
		int i = 0, j = nums.length - 1, k = nums.length - 1;
		
		while(i <= j)
		{
			if(nums[i] * nums[i] > nums[j] * nums[j])
			{
				res[k--] = nums[i] * nums[i];
				i++;
			}
			else
			{
				res[k--] = nums[j] * nums[j];
				j--;
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,-1,0,3,10};
		
		SortedSquaredArray s = new SortedSquaredArray();
		int[] result = s.getSortedSquaredArray(nums);
		
		for(int i : result)
			System.out.print(i + " ");
	}

}
