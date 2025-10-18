import java.util.Scanner;

public class Pattern20 {
    static void patternMake(int n){
        for(int i=1; i<=2*n; i++){
            int star = i;
            if(i>n) star=2*n-i;
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            if(i>n) space = 2*(i-n);
            for(int k=0; k<space; k++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
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
