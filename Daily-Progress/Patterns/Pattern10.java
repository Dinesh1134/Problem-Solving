import java.util.Scanner;

public class Pattern10 {
    static void patternMake(int num){
        for(int i=1; i<=2*num-1; i++){
            int start = i;
            if(i>num)start = 2*num-i;
            for(int j=1; j<=start; j++){
                System.out.print("* ");
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
