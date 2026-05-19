package pekan7_2511531014;

public class SelectionSort_2511531014 {
	    public static void selectionSort_2511531014(int[] arr) {
	        int n_1014 = arr.length;
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++) {
	            int minIndex = i_1014;
	            for (int j_1014 = i_1014 + 1; j_1014 < n_1014; j_1014++) {
	                if (arr[j_1014] < arr[minIndex]) {
	                    minIndex = j_1014;
	                }
	            }
	            int temp = arr[i_1014];
	            arr[i_1014] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }
	    public static void main(String[] args) {
	        int arr[] = {23, 78, 45, 8, 32, 56, 1};
	        int n_1014 = arr.length;
	        System.out.printf("array yang belum terurut:\n");
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++) {
	            System.out.print(arr[i_1014] + " ");
	        }
	        System.out.println("");
	        selectionSort_2511531014(arr);
	        System.out.printf("array yang terurut:\n");
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++) {
	            System.out.print(arr[i_1014] + " ");
	        System.out.println("");
	        }
	    }

}
