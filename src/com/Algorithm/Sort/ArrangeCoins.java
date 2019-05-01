package com.Algorithm.Sort;

/**
 * 441. 排列硬币
 * @author Administrator
 *
 */
public class ArrangeCoins {
	
	/**
	 * 从第一行加到第K行共有(1 + K)*K/2个硬币，设第(K + 1)行有m个（0<=m<=K），则有公式(1 + K)*K/2 + m = n，这是一个一元二次方程，
	 * 利用高中学过的公式解得 K = -0.5 + sqrt(0.25 + 2(n - m))；（sqrt表示根号，排除了了一个负解），
	 * 对于n以及根号来说，m很小，可以排除，最后可得 K = -0.5 + sqrt(0.25 + 2n )；
	 * @param n
	 * @return
	 */
    public static int arrangeCoins(int n) {
    	return (int)(Math.sqrt( (double)n * 2 + 0.25) - 0.5);
    }
	
	public static void main(String[] args) {
		arrangeCoins(8);
	}

}
