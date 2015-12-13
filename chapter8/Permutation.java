package chapter8;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月19日 下午10:51:26
 * 
 *        Pro 3.2 Full-Permutation 超过10就很慢了。
 */

public class Permutation {

	static boolean vis[] = new boolean[9999];
	static int a[] = new int[9999];

	static void print(int n) {
		for (int i = 1; i <= n; i++)
			System.out.printf("%d%c", a[i], (i < n ? ' ' : '\n'));
	}

	static void dfs(int now, int sum, int n) {
		if (sum == n) {
			print(n);
			return;
		}
		for (int i = 1; i <= n; i++)
			if (!vis[i]) {
				vis[i] = true;
				a[sum + 1] = i;
				dfs(i, sum + 1, n);
				vis[i] = false;
			}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		dfs(0, 0, n);
		in.close();
	}

}
