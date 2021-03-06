package chapter7;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午10:04:16
 * 
 *        MergeSort
 */

public class MergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int q = (left + right) / 2;
			mergeSort(arr, left, q);
			mergeSort(arr, q + 1, right);
			merge(arr, left, q, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[right - left + 1];
		int[] R = new int[right - left + 1];
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int i = 0; i < n2; i++)
			R[i] = arr[mid + i + 1];
		L[n1] = 0x7fffffff;
		R[n2] = 0x7fffffff;
		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (L[i] <= R[j])
				arr[k] = L[i++];
			else
				arr[k] = R[j++];
		}
	}

	public static String toString(int[] arr) {
		String str = "{ ";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + (i < arr.length - 1 ? ", " : "");
		}
		str += " }";
		return str;
	}

	public static void main(String[] args) {
		int[] arr = { 999, 2, 3, 66, 5, 6 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(toString(arr));
	}

}
