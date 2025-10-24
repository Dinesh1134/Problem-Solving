import java.util.Scanner;

public class GCDLCM {
    // static public int gcdLcm(int n1, int n2){
    //     if(n1==0 && n2==0)return 0;
    //     int num = 0, gcd = 0;

    //     if(n1>n2){
    //         num = n2;
    //     }else{
    //         num = n1;
    //     }
    //     for(int i=1; i<=num; i++){
    //         if(n1%i==0 && n2%i==0)
    //             gcd = i;
    //     }
    //     return gcd;
    // }

    static public void gcdLcm(int n1, int n2){
        if(n1==0 && n2==0) System.out.println(0);
        int gcd = 0, lcm = 0;
        int num1 = n1, num2 = n2;
        while(num1>0 && num2>0){
            if(num1>num2)
                num1=num1%num2;
            else{
                num2=num2%num1;
            }
        }
        if(num1==0)
            System.out.println(gcd=num2);
        System.out.println(gcd=num1);
        System.out.println(lcm = (n1*n2)/gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        gcdLcm(sc.nextInt(), sc.nextInt());
    }
}
