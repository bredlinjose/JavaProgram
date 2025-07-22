package array.program;

public class CoinChange {
	
	// Dynamic Programming
	private static int coinChange1(int[] coins, int amount) {
		// Check edge case
		if(amount < 1) return 0;
		
		// Create DP array
		int[] minCoinsDP = new int[amount + 1];
		
		for (int i = 1; i <= amount; i++) {
			minCoinsDP[i] = Integer.MAX_VALUE;
			
			// Try each coin
			for (int coin : coins) {
				if(coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE) {
					minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
				}
			}
		}
		if(minCoinsDP[amount] == Integer.MAX_VALUE) return -1;
		
		return minCoinsDP[amount];
	}
	
	// Brute Force
	private static int coinChange2(int[] coins, int amount) {
		if (amount < 0) return -1;      // Invalid amount
		if (amount == 0) return 0;      // No coins needed

		int min = Integer.MAX_VALUE;

		for (int coin : coins) {
			int res = coinChange2(coins, amount - coin); // Recurse by choosing the coin
			if (res >= 0 && res < min) {
				min = 1 + res;  // 1 coin used + result from subproblem
			}
		}

		return (min == Integer.MAX_VALUE) ? -1 : min;
	}

	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		
		int coinCount = coinChange1(coins, amount);
		System.out.println("Minimum coin count: " + coinCount);
		
		int minCount = coinChange2(coins, amount);
		System.out.println("Minimum coin count: " + minCount);

	}

}
