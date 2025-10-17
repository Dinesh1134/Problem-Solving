import java.util.Scanner;

public class Pattern7 {
    static void patternMake(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<num-i-1; j++){
                System.out.print(" ");
            }

            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }

            for(int l=0; l<num-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        patternMake(sc.nextInt());
    }
}
