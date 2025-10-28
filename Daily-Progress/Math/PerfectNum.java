import java.util.Scanner;

public class PerfectNum {

    static public boolean perfectNum(int n){
        int sum = 0, original = n;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println(original);
        return original == sum ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        perfectNum(sc.nextInt());
    }
}
