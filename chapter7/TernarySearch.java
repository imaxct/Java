package chapter7;

import java.util.Arrays;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午9:30:27
 * 
 *        Pro 3.1 三分 find the first element >= key
 */

public class TernarySearch {
	public static int ternarySearch(int[] arr, int key, int left, int right) {
		while (left < right) {
			int mid = left + (left + right) / 3;
			int mmid = right - (left + right) / 3;
			System.out.println(mid + " " + mmid);
			if (arr[mid] <= key && key <= arr[mmid]) {
				left = mid;
				right = mmid;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else if (key > arr[mmid]) {
				left = mmid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 6 };
		Arrays.sort(array);
		int pos = ternarySearch(array, 4, 0, array.length - 1);
		System.out.println(pos);
	}
}
