package runtunan;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan nama lengkap
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();

        // Mengubah huruf vokal menjadi 'X'
        String namaX = ubahHurufVokal(namaLengkap);

        // Menampilkan hasil
        System.out.println("Nama dengan huruf vokal menjadi 'X': " + namaX);
    }

    // Metode untuk mengubah huruf vokal menjadi 'X'
    public static String ubahHurufVokal(String nama) {
        String hasil = "";
        for (int i = 0; i < nama.length(); i++) {
            char karakter = nama.charAt(i);
            if (isHurufVokal(karakter)) {
                hasil += 'X';
            } else {
                hasil += karakter;
            }
        }
        return hasil;
    }

    // Metode untuk memeriksa apakah suatu karakter adalah huruf vokal
    public static boolean isHurufVokal(char c) {
        char hurufKecil = Character.toLowerCase(c);
        return hurufKecil == 'a' || hurufKecil == 'e' || hurufKecil == 'i' || hurufKecil == 'o' || hurufKecil == 'u';
    }
}

