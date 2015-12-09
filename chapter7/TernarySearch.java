package chapter7;

import java.util.Arrays;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午9:30:27
 * 
 *        Pro 3.1 三分
 */

public class TernarySearch {
	public static int ternarySearch(int[] arr, int key, int left, int right) {
		while (left < right) {
			int mid = left + (left + right) / 3;
			int mmid = right - (left + right) / 3;
			if (key < arr[mid])
				right = mid - 1;
			else if (key > arr[mmid])
				left = mmid + 1;
			else if (key > arr[mid] && key <= arr[mmid]) {
				left = mid + 1;
				right = mmid;
			} else if (key >= arr[mid] && key < arr[mmid]) {
				left = mid;
				right = mmid - 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] array = { 0, 2, 3, 4, 5, 8, 9 };
		Arrays.sort(array);
		int pos = ternarySearch(array, 2, 0, array.length - 1);
		System.out.println(pos);
	}
}
