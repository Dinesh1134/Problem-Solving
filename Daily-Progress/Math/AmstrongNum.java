import java.util.Scanner;

public class AmstrongNum {
    static public boolean amstrong(int n){
        int original = n;
        int sum=0;
        int digit = String.valueOf(original).length();
        if(n<0){
            return false;
        }else{
            while (n>0) {
                int lastdigit = n%10;
                sum += Math.pow(lastdigit, digit);
                n = n/10;
            }
        }
        return original == sum ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(amstrong(sc.nextInt()));
    }
}
