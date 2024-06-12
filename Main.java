
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenKaryawan manajemenKaryawan = new ManajemenKaryawan();

        while (true) {
            System.out.println("\n-- Daftar Karyawan --");
            System.out.println("==================================================================");

            manajemenKaryawan.displayKaryawan();

            System.out.println("\nMenu:");
            System.out.println("1. Tambah data karyawan");
            System.out.println("2. Ubah data karyawan");
            System.out.println("3. Hapus data karyawan");

            System.out.print("Input [0:EXIT]: ");
            int selectionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (selectionMenu) {
                case 1:
                    manajemenKaryawan.addKaryawan(scanner);
                    break;
                case 2:
                    manajemenKaryawan.updateKaryawan(scanner);
                    break;
                case 3:
                    manajemenKaryawan.deleteKaryawan(scanner);
                    break;
                case 0:
                    manajemenKaryawan.exitApp();
                    return;
                default:
                    System.out.println("Kode menu yang anda input tidak valid!");
            }

        }
    }
}
