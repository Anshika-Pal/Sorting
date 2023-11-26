
public class DSA_Sorting_Selection {
	public static void main(String[] args) {
		int arr[] = { 4, 56, 8, 2, 56, 14, 6, 5, 2, 56, 14, 5 };

		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int temp = arr[i];
			int pos = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					pos = j;
				}
			}
			arr[pos] = arr[i];
			arr[i] = temp;
		}

		// printing the sorted array
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
