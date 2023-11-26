
public class DSA_Sorting_Insertion {
	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,2,56,14,5};

		int len = arr.length;
        for (int i = 1; i <= len-1; i++) {
        		int key = arr[i]; 
            int j = i - 1; 

            /* Shift elements of a[i-1 .... 0], that are greater than key, to one position right of their current position */ 
            while (j >= 0 && key < arr[j])
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        //printing the sorted array
        for (int x:arr) {
        		System.out.print(x+" "); 
        }
	}
}
