import java.util.Scanner;

public class Pattern17 {
    static void patternMake(int n){
        for(int i=0; i<n; i++){
            char ch ='A';
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print(ch);
                if(k>=i) ch--;
                else ch++;
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
