import java.util.Scanner;

public class Pattern13 {
    static void patternMake(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(num + " ");
                num++;
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
