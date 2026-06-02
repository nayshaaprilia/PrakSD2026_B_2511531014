package pekan8_2511531014;

public class QuickSort_2511531014 {
	static void swap(int[] arr_1014, int i_1014, int j_1014)
	{
		int temp_1014 = arr_1014 [i_1014];
		arr_1014 [i_1014] = arr_1014 [j_1014];
		arr_1014 [j_1014] = temp_1014;
	}
	//Metode tambahan untuk mengatur pivot mengunakan median-of-Three
	static void medianOfThree(int[] arr_1014, int low_1014, int high_1014)
	{
		int mid_1014 = low_1014 + (high_1014 - low_1014) / 2;
		
		// Ururtkan elemen low, mid, dan high
		if (arr_1014[low_1014] > arr_1014[mid_1014]) {
			swap(arr_1014, low_1014, mid_1014);
		}
		if (arr_1014[low_1014] > arr_1014[high_1014]) {
			swap(arr_1014, low_1014, high_1014);
		}
		if (arr_1014[mid_1014] > arr_1014[high_1014]) {
			swap(arr_1014, mid_1014, high_1014);
		}
		swap(arr_1014, mid_1014, high_1014);
	}
	static int partition_2511531014 (int[] arr_1014, int low_1014, int high_1014)
	{
		//Panggil fungsi medianOfThree sebelum menentukan pivot 
		medianOfThree(arr_1014,low_1014, high_1014);
		
		int pivot_1014 = arr_1014[high_1014]; //sekarang arr[high] sudah berisi nilai median
		int i_1014 = (low_1014 - 1);
		
		for (int j_1014 = low_1014; j_1014 <= high_1014 - 1; j_1014++) {
			//jika elemen saat ini lebih kecil dari atau sama dengan pivot 
			if (arr_1014[j_1014] < pivot_1014) {
				//increment indeks elemen yang lebih kecil 
				i_1014++;
				swap(arr_1014, i_1014, j_1014);
			}
		}
		swap(arr_1014, i_1014 + 1, high_1014);
		return (i_1014 + 1);
		
		
	}
	static void quickSort_2511531014(int[] arr_1014, int low_1014, int high_1014)
	{
	    if (low_1014 < high_1014) {
	        int pi_1014 = partition_2511531014(arr_1014, low_1014, high_1014);

	        quickSort_2511531014(arr_1014, low_1014, pi_1014 - 1);
	        quickSort_2511531014(arr_1014, pi_1014 + 1, high_1014);
	    }
	}

	public static void printArr_2511531014(int[] arr_1014)
	{
	    for (int i_1014 = 0; i_1014 < arr_1014.length; i_1014++) {
	        System.out.print(arr_1014[i_1014] + " ");
	    }
	    System.out.println();
	}

	public static void main(String[] args)
	{
	    int[] arr_1014 = {10, 7, 8, 9, 1, 5};

	    int N_1014 = arr_1014.length;

	    System.out.print("Data sebelum diurutkan: ");
	    printArr_2511531014(arr_1014);

	    quickSort_2511531014(arr_1014, 0, N_1014 - 1);

	    System.out.print("Data Terurut quicksort: ");
	    printArr_2511531014(arr_1014);
	}
}
