package pekan7_2511531014;

public class BubbleSort_2511531014 {
	    public static void bubbleSort_2511531014(int[] arr) {
	        int n_1014 = arr.length;
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++) {
	            for (int j_1014 = 0; j_1014 < n_1014 - i_1014 - 1; j_1014++) {
	                if (arr[j_1014] > arr[j_1014 + 1]) {
	                    int temp = arr[j_1014];
	                    arr[j_1014] = arr[j_1014 + 1];
	                    arr[j_1014 + 1] = temp;
	                    // System.out.println("data:" + arr[j_1014] + " " + arr[j_1014 + 1]);
	                }
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int arr[] = {23, 78, 45, 8, 32, 56, 1};
	        int n_1014 = arr.length;
	        System.out.print("array yang belum terurut:");
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++)
	            System.out.print(arr[i_1014] + " ");
	        System.out.println("");
	        bubbleSort_2511531014(arr);
	        System.out.print("array yang terurut menggunakan BubbleSort:");
	        for (int i_1014 = 0; i_1014 < n_1014; i_1014++)
	            System.out.print(arr[i_1014] + " ");
	        System.out.println("");
	    }
	}

