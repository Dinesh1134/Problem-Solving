import java.util.Scanner;

public class pattern19 {
    static void patternMake(int n){
        for(int i=0; i<2*n; i++){
            int left = n-i;
            if(i>=n) left = i-n+1;
            for(int j=0; j<left; j++){
                System.out.print("*");
            }
            int right = 2*i;
            if(i>=n) right = 2*((2*n)-i-1);
            for(int l=0; l<right; l++){
                System.out.print(" ");
            }
            
            for(int k=0; k<left; k++){
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
