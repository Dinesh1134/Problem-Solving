import java.util.Scanner;

public class Pattern6 {
    static void patternMake(int num){
        for(int i=num; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
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
