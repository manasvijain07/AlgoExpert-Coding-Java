package Arrays;

/**
 * Valid Subsequence -  Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.
 * Given a main array and a subsequence array, we have to check that subsequence is contained in the main array.
 * We also need to take into consideration the order of elements
 * result - boolean
 */
public class ValidSubsequence {
	
	/**
	 * 	Approach 1 - Using While Loop
	 * 	TC - O(N) --> N - length of main array
	 *	SC - O(1)
	 */
	public boolean isValidSequenceWhileLoop(int[] main, int[] seq)
	{
		int i = 0, j = 0;
		
		while(i < main.length && j < seq.length)
		{
			if(main[i] == seq[j])
			{
				j++;
			}
			i++;
		}
		
		return j == seq.length;
	}
	
	/**
	 * 	Approach 2 - Using for Loop for iterating over main array
	 * 	TC - O(N) --> N - length of main array
	 *	SC - O(1)
	 * @param args
	 */

	public boolean isValidSequenceForLoop(int[] main, int[] seq)
	{
		int i = 0;
		
		for(int j = 0; j < main.length; j++)
		{
			if(i == seq.length)
				return true;
			if(seq[i] == main[j])
			{
				i++;
			}
		}
		return i == seq.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidSubsequence v = new ValidSubsequence();
		int[] main = {5, 1, 22, 25, 6, -1, 8, 10};
		int[] seq = {1, 6, -1, 10};
		System.out.println("Using Approach 1 - " + v.isValidSequenceWhileLoop(main, seq));
		System.out.println("Using Approach 2 - " + v.isValidSequenceForLoop(main, seq));
	}

}
