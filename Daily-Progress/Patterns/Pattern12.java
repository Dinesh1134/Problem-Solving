import java.util.Scanner;

public class Pattern12 {
    static void patternMake(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int k=0; k<2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l=i; l>0; l--){
                System.out.print(l);
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
