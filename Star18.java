import java.util.Scanner;

public class Star18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }

}