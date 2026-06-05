package TugasPekan8_2511531014;


import java.util.Scanner;

public class Sorting_2511531014 {

    Lagu_2511531014[] dataLagu_1014 =
            new Lagu_2511531014[20];

    int jumlahData_1014 = 0;

    // input data lagu
    public void inputData_1014() {

        Scanner input_1014 = new Scanner(System.in);

        System.out.print("Jumlah lagu (minimal 7): ");
        jumlahData_1014 = input_1014.nextInt();
        input_1014.nextLine();

        for (int i_1014 = 0; i_1014 < jumlahData_1014; i_1014++) {

            System.out.println("\nData Lagu ke-" + (i_1014 + 1));

            System.out.print("Judul : ");
            String judul_1014 = input_1014.nextLine();

            System.out.print("Penyanyi : ");
            String penyanyi_1014 = input_1014.nextLine();

            System.out.print("Durasi (detik) : ");
            int durasi_1014 = input_1014.nextInt();
            input_1014.nextLine();

            dataLagu_1014[i_1014] =
                    new Lagu_2511531014(
                            judul_1014,
                            penyanyi_1014,
                            durasi_1014);
        }
    }

    // menukar data lagu
    public void swap_1014(int i_1014, int j_1014) {

        Lagu_2511531014 temp_1014 =
                dataLagu_1014[i_1014];

        dataLagu_1014[i_1014] =
                dataLagu_1014[j_1014];

        dataLagu_1014[j_1014] =
                temp_1014;
    }

    // partition quick sort
    public int partition_1014(int low_1014,
                              int high_1014) {

        int pivot_1014 =
                dataLagu_1014[high_1014].durasi_1014;

        int i_1014 = low_1014 - 1;

        for (int j_1014 = low_1014;
             j_1014 < high_1014;
             j_1014++) {

            if (dataLagu_1014[j_1014].durasi_1014
                    < pivot_1014) {

                i_1014++;
                swap_1014(i_1014, j_1014);
            }
        }

        swap_1014(i_1014 + 1, high_1014);

        return i_1014 + 1;
    }

    // quick sort
    public void quickSort_1014(int low_1014,
                               int high_1014) {

        if (low_1014 < high_1014) {

            int pi_1014 =
                    partition_1014(
                            low_1014,
                            high_1014);

            quickSort_1014(
                    low_1014,
                    pi_1014 - 1);

            quickSort_1014(
                    pi_1014 + 1,
                    high_1014);
        }
    }

    // tampil data
    public void tampilData_1014() {

        for (int i_1014 = 0;
             i_1014 < jumlahData_1014;
             i_1014++) {

            System.out.println(
                    (i_1014 + 1) + ". "
                    + dataLagu_1014[i_1014].judul_1014
                    + " - "
                    + dataLagu_1014[i_1014].penyanyi_1014
                    + " - "
                    + dataLagu_1014[i_1014].durasi_1014
                    + " detik");
        }
    }

    public static void main(String[] args) {

        Sorting_2511531014 playlist_1014 =
                new Sorting_2511531014();

        System.out.println(
                "=== Sorting Playlist NIM: 2511531014 ===");

        playlist_1014.inputData_1014();

        System.out.println(
                "\n=== Data Sebelum Sorting ===");

        playlist_1014.tampilData_1014();

        playlist_1014.quickSort_1014(
                0,
                playlist_1014.jumlahData_1014 - 1);

        System.out.println(
                "\n=== Data Setelah Quick Sort (Durasi Asc) ===");

        playlist_1014.tampilData_1014();
    }
}