package knapsack0_1Problem;
public class Knapsack0_1Problem{
	// returns maximum of two integers
	static int max(int m, int n)
	{
	return (m > n) ? m : n;
	}
	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int i)
	{
		// Base Case
		if (i == 0 || W == 0)
			return 0;
		
		// If weight of the nth item is more than Knapsack capacity W, then this item cannot be included in the optimal solution
		if (wt[i - 1] > W)
			return knapSack(W, wt, val, i - 1);

		// Return the maximum of two cases
		else
			return max(val[i - 1]
					+ knapSack(W - wt[i - 1], wt,
								val, i - 1),
					knapSack(W, wt, val, i - 1));   
	}

	// Main
	public static void main(String args[])
	{
		int val[] = new int[] { 80, 120, 150 };
		int wt[] = new int[] { 10, 15, 30 };
		int W = 60;
		int i = val.length;
		System.out.println(knapSack(W, wt, val, i));
	}
}
