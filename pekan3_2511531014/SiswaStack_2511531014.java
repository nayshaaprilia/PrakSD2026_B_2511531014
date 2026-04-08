package pekan3_2511531014;
import java.util.ArrayList;

class Siswa_2511531014 {
    String nama;
    int nim;
    
    public Siswa_2511531014(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    @Override
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2511531014 {
    private ArrayList<Siswa_2511531014> stack;
    
    public SiswaStack_2511531014() {
        stack = new ArrayList<>();
    }
    
    public void push(Siswa_2511531014 mhs) {
        stack.add(mhs);
    }

    public Siswa_2511531014 pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa_2511531014 peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public void tampilkanSiswa() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2511531014 studentStack_2511531014 = new SiswaStack_2511531014();
        
        Siswa_2511531014 mhs1 = new Siswa_2511531014("Ali", 1);
        Siswa_2511531014 mhs2 = new Siswa_2511531014("Boby", 2);
        Siswa_2511531014 mhs3 = new Siswa_2511531014("Charles", 3);
        
        studentStack_2511531014.push(mhs1);
        studentStack_2511531014.push(mhs2);
        studentStack_2511531014.push(mhs3);
        
        System.out.println("Siswa di dalam stack:");
        studentStack_2511531014.tampilkanSiswa();
        
        System.out.println("Siswa teratas: " + studentStack_2511531014.peek());
        System.out.println("Mengeluarkan siswa: " + studentStack_2511531014.pop());
        
        System.out.println("Setelah pop:");
        studentStack_2511531014.tampilkanSiswa();
    }    
}