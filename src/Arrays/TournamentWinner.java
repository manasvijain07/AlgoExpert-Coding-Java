package Arrays;

import java.util.HashMap;

public class TournamentWinner {
	
	//TC - O(N)	SC - O(N) {N- size of competitions}
	public String getWinner(String[][] competitions, int[] results)
	{
		String winner = "";
		HashMap<String, Integer> map = new HashMap<>();
		int i = 0;
		
		for(String[] teams: competitions)
		{
			if(results[i++] == 1)
			{
				map.put(teams[0], map.getOrDefault(teams[0], 0) + 3);
			}
			else
			{
				map.put(teams[1], map.getOrDefault(teams[1], 0) + 3);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(String s: map.keySet())
		{
			if(map.get(s) > max)
			{
				max = map.get(s);
				winner = s;
			}
		}
		return winner;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] competitions = {
				{"HTML", "C#"},
				{"C#", "Python"},	
				{"Python", "HTML"}};
			
		int[] results = {0, 0, 1};
		
		TournamentWinner t = new TournamentWinner();
		String res = t.getWinner(competitions, results);
		
		System.out.print(res);
	}
}

