import java.util.Scanner;

public class Pattern2 {
    static void patternMake(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
            patternMake( sc.nextInt());
    }
}
