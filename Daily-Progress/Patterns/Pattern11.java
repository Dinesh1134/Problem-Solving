import java.util.Scanner;

public class Pattern11 {
    static void patternMake(int num){
        for(int i=1; i<=num; i++){
            int start = 1;
            if(i%2==0) start =0;
            for(int j=0; j<i; j++ ){
                System.out.print(start);
                start = 1-start;
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
