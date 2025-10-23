import java.util.Scanner;

public class Countdig {
       static public int countDigit(int n) {
        int result=0;
        while(n>0){
            n = n/10;
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        System.out.println(countDigit(sc.nextInt()));
    }
}
