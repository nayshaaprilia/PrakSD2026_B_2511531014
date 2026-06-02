package pekan8_2511531014;

public class ShellSort_2511531014 {
	public static void ShellSort_2511531014 (int[] A_1014) {
		int n_1014 = A_1014.length;
		int gap_1014 = n_1014 / 2;
		while (gap_1014 > 0) {
			for (int i_1014= gap_1014; i_1014 < n_1014; i_1014++) {
				int temp_1014 = A_1014[i_1014];
				int j_1014= i_1014;
				while (j_1014 >= gap_1014 && A_1014 [j_1014 - gap_1014] > temp_1014) {
					A_1014[j_1014] = A_1014[j_1014 - gap_1014];
					j_1014 = j_1014 - gap_1014;
				}
				A_1014[j_1014] = temp_1014;			
			}
			gap_1014 = gap_1014 / 2;
		}
	}
public static void  main (String [] args) {
	int [] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
	
	System.out.print("sebelum: ");
	printArray_2511531014(data);
	
	ShellSort_2511531014(data);
	
	System.out.print("Sesudah (Shell Sort) : ");
	printArray_2511531014(data);
}
public static void printArray_2511531014 (int[] arr) {
	for (int i_1014 : arr) System.out.print (i_1014 + " ");
	System.out.println();
}
}
