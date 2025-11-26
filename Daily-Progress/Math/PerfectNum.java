import java.util.Scanner;

public class PerfectNum {

    static public boolean perfectNum(int n){
        if(n == 1) return false;
        
        int sum = 1;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                sum += i;
                if(i != n / i)
                    sum += n / i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(perfectNum(num))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is NOT a Perfect Number");
    }
}