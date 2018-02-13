import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = n / 3600 % 24;
        int m = n / 60 % 60;
        int s = n % 60;
        System.out.printf("%d:%0,2d:%0,2d", h, m, s);
    }
}
