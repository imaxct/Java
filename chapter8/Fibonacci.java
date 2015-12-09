package chapter8;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��19�� ����10:34:24
 * 
 *        Pro 3.1 Fibonacci
 */

public class Fibonacci {

	static int dfs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return dfs(n - 1) + dfs(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("����һ��������n(��Ҫ̫��):");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d ", dfs(i));
		}
		in.close();
	}

}
