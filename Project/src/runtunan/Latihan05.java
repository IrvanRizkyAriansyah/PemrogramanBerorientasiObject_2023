package runtunan;
import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan teks: ");
        String input = scanner.nextLine();

        // Mengubah teks menjadi huruf BESAR
        String uppercaseText = input.toUpperCase();

        // Menampilkan hasil
        System.out.println("Teks dalam huruf BESAR: " + uppercaseText);
    }
}
