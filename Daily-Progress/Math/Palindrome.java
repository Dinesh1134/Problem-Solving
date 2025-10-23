// Palindrome Number

import java.util.Scanner;

public class Palindrome {
    static public boolean palindrome(int n){
        int original=n, rev=0, lastdigit;
        if(n<0){
            return false;
        }else{
            while (n>0) {
                lastdigit = n%10;
                rev = rev*10 +lastdigit;
                n = n/10;
            }
        }
        return original==rev ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(palindrome(sc.nextInt()));
    }
}
