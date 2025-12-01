import java.util.Scanner;

public class LargEle {
    public static int largestElement(int arr[]){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest)
                largest=arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

       System.out.println( largestElement(arr));
    }    
}
