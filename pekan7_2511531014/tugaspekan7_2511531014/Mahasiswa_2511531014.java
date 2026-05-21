package tugaspekan7_2511531014;

public class Mahasiswa_2511531014 {
	
	    private String nama_1014;
	    private String nim_1014;
	    private String prodi_1014;

	    // Constructor
	    public Mahasiswa_2511531014(String nama_1014, String nim_1014, String prodi_1014) {
	        this.nama_1014 = nama_1014;
	        this.nim_1014 = nim_1014;
	        this.prodi_1014 = prodi_1014;
	    }

	    // Getter dan Setter
	    public String getNama() {
	        return nama_1014;
	    }

	    public void setNama(String nama) {
	        this.nama_1014 = nama;
	    }

	    public String getNim() {
	        return nim_1014;
	    }

	    public void setNim(String nim) {
	        this.nim_1014 = nim;
	    }

	    public String getProdi() {
	        return prodi_1014;
	    }

	    public void setProdi(String prodi) {
	        this.prodi_1014 = prodi;
	    }

	    // toString
	    @Override
	    public String toString() {
	        return nama_1014 + " - " + nim_1014 + " - " + prodi_1014;
	    }
	}
