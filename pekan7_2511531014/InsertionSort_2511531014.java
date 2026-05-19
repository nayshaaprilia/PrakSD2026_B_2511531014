package pekan7_2511531014;

public class InsertionSort_2511531014 {
	public static void insertionSort_2511531014(int[] arr) {
		int n_1014 = arr.length;
		for (int i_1014 = 1; i_1014 < n_1014; i_1014++) {
			int key = arr[i_1014];
			int j_1014 = i_1014 - 1;
			while (j_1014 >= 0 && arr[j_1014] > key) {
				arr[j_1014 + 1] = arr[j_1014];
				j_1014--;
			}
			arr [j_1014 + 1] = key;
		}
	}
	public static void main (String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1014 = arr.length;
		System.out.printf("array yang belum terurut: \n");
		for (int i_1014 =0;  i_1014 < n_1014; i_1014++)
			System.out.print(arr[i_1014] + " ");
		System.out.println("");
	}

}
