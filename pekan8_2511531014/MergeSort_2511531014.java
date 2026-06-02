package pekan8_2511531014;

public class MergeSort_2511531014 {

    void Merge_2511531014(int arr_1014[], int l_1014, int m_1014, int r_1014) {

        int n1_1014 = m_1014 - l_1014 + 1;
        int n2_1014 = r_1014 - m_1014;

        int L_1014[] = new int[n1_1014];
        int R_1014[] = new int[n2_1014];

        for (int i_1014 = 0; i_1014 < n1_1014; ++i_1014)
            L_1014[i_1014] = arr_1014[l_1014 + i_1014];

        for (int j_1014 = 0; j_1014 < n2_1014; ++j_1014)
            R_1014[j_1014] = arr_1014[m_1014 + 1 + j_1014];

        int i_1014 = 0;
        int j_1014 = 0;
        int k_1014 = l_1014;

        while (i_1014 < n1_1014 && j_1014 < n2_1014) {
            if (L_1014[i_1014] <= R_1014[j_1014]) {
                arr_1014[k_1014] = L_1014[i_1014];
                i_1014++;
            } else {
                arr_1014[k_1014] = R_1014[j_1014];
                j_1014++;
            }
            k_1014++;
        }

        while (i_1014 < n1_1014) {
            arr_1014[k_1014] = L_1014[i_1014];
            i_1014++;
            k_1014++;
        }

        while (j_1014 < n2_1014) {
            arr_1014[k_1014] = R_1014[j_1014];
            j_1014++;
            k_1014++;
        }
    }

    void sort_2511531014(int arr_1014[], int l_1014, int r_1014) {
        if (l_1014 < r_1014) {

            int m_1014 = (l_1014 + r_1014) / 2;

            sort_2511531014(arr_1014, l_1014, m_1014);
            sort_2511531014(arr_1014, m_1014 + 1, r_1014);

            Merge_2511531014(arr_1014, l_1014, m_1014, r_1014);
        }
    }

    static void printArray_2511531014(int arr_1014[]) {
        int n_1014 = arr_1014.length;

        for (int i_1014 = 0; i_1014 < n_1014; ++i_1014)
            System.out.print(arr_1014[i_1014] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr_1014[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_2511531014(arr_1014);

        MergeSort_2511531014 ob_1014 = new MergeSort_2511531014();
        ob_1014.sort_2511531014(arr_1014, 0, arr_1014.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort");
        printArray_2511531014(arr_1014);
    }
}