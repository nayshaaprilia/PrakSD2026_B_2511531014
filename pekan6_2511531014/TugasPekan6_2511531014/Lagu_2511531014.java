package TugasPekan6_2511531014;

public class Lagu_2511531014 {

    // mendefinisikan class node lagu
    String judul_1014;
    String penyanyi_1014;

    // pointer ke next dan previous node
    Lagu_2511531014 next_1014; //pointer untuk maju
    Lagu_2511531014 prev_1014; //pointer untuk mundur

    // konstruktor
    public Lagu_2511531014(String judul_1014, String penyanyi_1014) {
        this.judul_1014 = judul_1014;
        this.penyanyi_1014 = penyanyi_1014;
        this.next_1014 = null;
        this.prev_1014 = null;
    }
}
