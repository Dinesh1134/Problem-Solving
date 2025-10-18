import java.util.Scanner;

public class Pattern15 {
    static void patternMake(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=0; j<=n-i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        patternMake(sc.nextInt());
    }
}
