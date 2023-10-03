package runtunan;

import java.util.Scanner;

public class Latihan08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan informasi
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Nama Kelas: ");
        String namaKelas = scanner.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline setelah angka

        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();

        // Menampilkan informasi
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("- NPM: " + npm);
        System.out.println("- Nama Lengkap: " + namaLengkap);
        System.out.println("- Nama Kelas: " + namaKelas);
        System.out.println("- Semester: " + semester);
        System.out.println("- IPK: " + ipk);
    }
}
