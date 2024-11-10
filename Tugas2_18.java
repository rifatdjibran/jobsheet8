import java.util.Scanner;

public class Tugas2_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int jumlahPeserta = 5;
        String namaPeserta;

        // input
        System.out.print("Masukkan jumlah Politeknik yang daftar: ");
        int jumlahPoliteknik = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println();
            System.out.println("Politeknik ke-" + i);

            // badminton
            System.out.println("Cabang Olahraga: Badminton");
            for (int j = 1; j <= jumlahPeserta; j++) {
                System.out.print("Nama peserta " + j + ": ");
                namaPeserta = input.nextLine();
            }

            // tenis meja
            System.out.println("Cabang Olahraga: Tenis Meja");
            for (int j = 1; j <= jumlahPeserta; j++) {
                System.out.print("Nama peserta " + j + ": ");
                namaPeserta = input.nextLine();
            }

            // basket
            System.out.println("Cabang Olahraga: Basket");
            for (int j = 1; j <= jumlahPeserta; j++) {
                System.out.print("Nama peserta " + j + ": ");
                namaPeserta = input.nextLine();
            }
            
            // voli
            System.out.println("Cabang Olahraga: Voli");
            for (int j = 1; j <= jumlahPeserta; j++) {
                System.out.print("Nama peserta " + j + ": ");
                namaPeserta = input.nextLine();
            }
        }

        input.close();
    }
}
