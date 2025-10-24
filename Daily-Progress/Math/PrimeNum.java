import java.util.Scanner;

public class PrimeNum {
    static public boolean primeNum(int n){
        if(n==0) return false;
        int count = 0;
        for(int i=1; i*i<n; i++){
            if(n%i==0){
                 count++;
                 if(n/i != i)
                    count++;
            }
        }
        return count==2 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(primeNum(sc.nextInt()));
    }
}
