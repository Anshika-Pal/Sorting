
public class DSA_Sorting_Radix {
	public static void main(String[] args) {
		int arr[]= {4,56,8,2,56,14,6,5,121,56,114,5,89,1};

		int len = arr.length; 
		
        //find max value in given array
        int max=arr[0];
        for(int i = 1; i <= len-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //find number of digits in max value
        int radixCount=0;
        while(max != 0){
        		radixCount++;
            max = max / 10;
        }
        //now sorting starts
        int div=1;
        int bucketsCounts[]=new int[10];
        int buckets[][]=new int[10][len];
        for(int i = 1; i <= radixCount; i++){
        		for(int j = 0; j <= 9; j++){
        			bucketsCounts[j] = 0;
            }
            for(int j = 0; j <= len - 1; j++){
                int k = (arr[j] / div) % 10;
                buckets[k][bucketsCounts[k]] = arr[j];
                bucketsCounts[k]++;
            }
            int pos = 0;
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= bucketsCounts[j]-1; k++){
                    arr[pos] = buckets[j][k];
                    pos++;
                }
            }
            div = div * 10;
        }
        //now sorting ends

        //printing the sorted array
        for (int x:arr) {
        	System.out.print(x+" "); 
        }
	}
}
