import java.util.Scanner;

public class Pattern8 {

    static void patternMake(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<2*(num-i)-1; k++){
                System.out.print("*");
            }

            for(int l=0; l<i; l++){
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
