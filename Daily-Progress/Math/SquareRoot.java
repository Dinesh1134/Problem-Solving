import java.util.Scanner;

public class SquareRoot {
    static public int squareRoots(int n){
        int result = (int)Math.sqrt(n);
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        System.out.println(squareRoots(sc.nextInt()));
    }
}
