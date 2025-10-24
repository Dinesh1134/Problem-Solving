import java.util.*;

public class Pattern23 {
    static void patternMake(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                // 🔹 Upper half (including middle)
                if (i < n) {
                    if (j == n - i || j == n + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // 🔹 Lower half (from middle onward)
                else {
                    if (j == i - n + 2 || j == 3 * n - i - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        patternMake(sc.nextInt());
    }
}
