package Arrays;

import java.util.Arrays;

public class NonConstructibleChange {
	
	// TC - O(n log n)	SC - O(1)
	public int getMinChange(int[] coins)
	{
		int result = 1;
		Arrays.sort(coins);
		for(int i: coins)
		{
			if(i > result)
				return result;
			result += i;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] coins = {5, 7, 1, 1, 2, 3, 22};
			
			NonConstructibleChange n = new NonConstructibleChange();
			System.out.print(n.getMinChange(coins));
	}

}
