// Reverse Integer

import java.util.Scanner;

public class ReverseNum {
    static public int reverse(int n){
        int result = 0, lastdigit;

        while(n!=0){
            lastdigit = n%10;
            result = result * 10+lastdigit;
            n = n/10;
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10){
                return 0;
            }
                                                                                                                                                                               
        }
        return result;
    } 
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(reverse(sc.nextInt()));
    }
}


// Optimal approch 

    // static public int reverse(int n){
    //     int result = 0, lastdigit;

    //     while(n!=0){
    //         lastdigit = n%10;
    //         result = result * 10+lastdigit;
    //         n = n/10;
    //         if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10){
    //             return 0;
    //         }
                                                                                                                                                                               
    //     }
    //     return result;
    // } 