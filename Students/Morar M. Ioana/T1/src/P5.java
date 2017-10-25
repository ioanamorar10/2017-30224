import java.util.Scanner;

public class P5 {
	public static int verifPrime(int number) {
		if (number == 1)
			return 0;
		int numarDiv = 0;
		int div = 2;
		while (div < number / 2) {
			if (number % div == 0)
				numarDiv++;
			div++;
		}
		if (numarDiv == 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {

		int n = 7;

		int i, j, k;

		/*
		 * float proc=100.0f; while (proc>10.00) {
		 */
		int[][] board = new int[n][n];
		int max = n * n;
		for (k = 1; k <= n / 2 + 1; k++) {
			for (j = n - k; j >= k - 1; j--) {
				board[n - k][j] = max;
				max = max - 1;
			}
			for (i = n - 1 - k; i >= k - 1; i--) {
				board[i][k - 1] = max;
				max = max - 1;
			}
			for (j = k; j <= n - k; j++) {
				board[k - 1][j] = max;
				max = max - 1;
			}
			for (i = k; i <= n - 1 - k; i++) {
				board[i][n - k] = max;
				max = max - 1;
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		int primenumbers = 0;
		int diagNumbers = 0;

		for (i = 0; i < n; i++) {
			if (verifPrime(board[i][i]) == 1)
				primenumbers++;
			if (verifPrime(board[i][n - i - 1]) == 1)
				primenumbers++;
		}
		// System.out.println(primenumbers);
		if (n % 2 == 0)
			diagNumbers = 2 * n;
		else
			diagNumbers = 2 * n - 1;
		float proc = ((float) primenumbers / diagNumbers) * 100;
		System.out.printf("%.2f\n", proc);

		/*
		 * n++; } System.out.println(n);
		 */
	}

}
