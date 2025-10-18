import java.util.Scanner;

public class Pattern22 {
        static void patternMake(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                System.out.print(n - Integer.min(Integer.min(top, bottom), Integer.min(left, right)));
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
