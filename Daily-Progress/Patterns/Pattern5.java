import java.util.Scanner;

public class Pattern5 {
    static void patternMake(int num){
        for(int i = 1; i<=num; i++){
            for(int j = i; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
        patternMake(sc.nextInt());
    }
}
