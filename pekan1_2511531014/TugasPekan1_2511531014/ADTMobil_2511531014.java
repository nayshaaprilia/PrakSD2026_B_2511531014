package TugasPekan1_2511531014;

public class ADTMobil_2511531014 {
	
	    private String nama;
	    private int tahun;
	    private int cc;
	    private double harga;
	    private String merk;

	    // Constructor
	    public ADTMobil_2511531014(String nama, int tahun, int cc, double harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    // ===== GETTER (SELEKTOR) =====
	    public String getNama() { return nama; }
	    public int getTahun() { return tahun; }
	    public int getCc() { return cc; }
	    public double getHarga() { return harga; }
	    public String getMerk() { return merk; }

	    // ===== SETTER (MUTATOR) =====
	    public void setNama(String nama) { this.nama = nama; }
	    public void setTahun(int tahun) { this.tahun = tahun; }
	    public void setCc(int cc) { this.cc = cc; }
	    public void setHarga(double harga) { this.harga = harga; }
	    public void setMerk(String merk) { this.merk = merk; }

	    // ===== METHOD TAMPIL =====
	    public void tampil() {
	        System.out.println(nama + " | " + tahun + " | " + cc + "cc | " + harga + " | " + merk);
	    }

	    // ===== ARRAY (STATIC) =====
	    public static ADTMobil_2511531014[] data = new ADTMobil_2511531014[10];
	    public static int n = 0;

	    // ===== TAMBAH MOBIL =====
	    public static void tambahMobil(ADTMobil_2511531014 m) {
	        if (n < data.length) {
	            data[n] = m;
	            n++;
	        } else {
	            System.out.println("Data penuh!");
	        }
	    }

	    // ===== HAPUS MOBIL =====
	    public static void hapusMobil(int index) {
	        if (index >= 0 && index < n) {
	            for (int i = index; i < n - 1; i++) {
	                data[i] = data[i + 1];
	            }
	            n--;
	        } else {
	            System.out.println("Index tidak valid!");
	        }
	    }

	    // ===== TAMPIL SEMUA =====
	    public static void tampilSemua() {
	        for (int i = 0; i < n; i++) {
	            data[i].tampil();
	        }
	    }
	}


