package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpiralTraversal {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length == 0)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        for(int i = 0; i < nums.length-3; i++)
        {
            for(int j = 0; j < nums.length-2; j++)
            {
                int start = j + 1, end = nums.length-1;
                while(start < end)
                {
                    if(nums[i] + nums[j] + nums[start] + nums[end] == target)
                        set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[start], nums[end])));
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }

	
	public static void main(String [] args)
	{
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		SpiralTraversal s = new SpiralTraversal();
		List<List<Integer>> res = s.fourSum(nums, target);

		System.out.print(res);
	}
}
