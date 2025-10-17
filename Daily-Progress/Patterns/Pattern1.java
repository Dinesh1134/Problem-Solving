//Statement: Given an integer N, print the following pattern.

import java.util.Scanner;

class Pattern1 {
    static void patternMake(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
        patternMake( sc.nextInt());
    }
}