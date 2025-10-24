import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDivisible {
    // static public void allDiviser(int n){
    //     for(int i=1; i<=n; i++){
    //         if(n%i == 0)
    //             System.out.print(i + " ");
    //     }
    // }

     static public void allDiviser(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");

                if(n/i != i)
                    System.out.println(n/i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        allDiviser(sc.nextInt());
    }
}
