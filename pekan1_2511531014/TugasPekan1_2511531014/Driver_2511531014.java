package TugasPekan1_2511531014;

public class Driver_2511531014 {
	public static void main(String[] args) {

	    ADTMobil_2511531014.tambahMobil(
	        new ADTMobil_2511531014("Avanza", 2022, 1300, 150000000, "Toyota")
	    );

	    ADTMobil_2511531014.tambahMobil(
	        new ADTMobil_2511531014("Brio", 2024, 1200, 200000000, "Honda")
	    );

	    ADTMobil_2511531014.tambahMobil(
	        new ADTMobil_2511531014("Rush", 2021, 1500, 540000000, "Toyota")
	    );

	    System.out.println("Data Mobil:");
	    ADTMobil_2511531014.tampilSemua();
	}

}
