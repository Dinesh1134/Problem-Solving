import java.util.Scanner;

public class ReversePower {
    static public int reversePower(int n){
        if(n==0) return 1;
        int power = 0;
        int result = 1, base = n;
        while(n>0){
            power = power * 10 + (n%10);
            n = n/10;
        }
        
        // for(int i=1; i<=power; i++){
        //     if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        //         return 0;
        //     result = result*base;
        // }

        // result = (int) Math.pow(base, power);
        // System.out.println(result);
        // return result;

        while(power>0){
            if((power & 1) == 1) //power % 2 != 0
                result = result * base;
            base = base * base;
            power >>= 1; //power = power / 2
        }
        System.out.println(base);
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(reversePower(sc.nextInt()));
    }
}
