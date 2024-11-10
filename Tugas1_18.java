import java.util.Scanner;

public class Tugas1_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int N, i, j;

        // input
        System.out.print("Masukkan nilai N : ");
        N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
