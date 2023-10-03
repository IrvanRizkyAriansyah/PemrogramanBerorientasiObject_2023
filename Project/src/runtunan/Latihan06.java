package runtunan;
import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan usia
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline setelah angka

        // Memasukkan Firstname
        System.out.print("Masukkan Firstname: ");
        String firstname = scanner.nextLine();

        // Memasukkan Lastname
        System.out.print("Masukkan Lastname: ");
        String lastname = scanner.nextLine();

        // Memasukkan NPM
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();

        // Menggabungkan nilai-nilai variabel menggunakan metode concat()
        String output = Integer.toString(usia).concat(firstname).concat(lastname).concat(npm);

        // Menampilkan hasil
        System.out.println("Hasil penggabungan: " + output);
    }
}