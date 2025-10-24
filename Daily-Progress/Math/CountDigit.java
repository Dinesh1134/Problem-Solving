import java.util.Scanner;

public class CountDigit {
    static public int countDigit(int n){
        int result=0, digit, num = n;
        while(n>0){
            digit = n%10;
            if(digit !=0 && num%digit==0){
                result++;
            }
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(countDigit(sc.nextInt()));
    }
}
