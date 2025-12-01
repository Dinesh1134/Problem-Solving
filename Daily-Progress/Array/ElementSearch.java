import java.util.Scanner;

public class ElementSearch {
    public static int elementSearch(int arr[], int x){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target of Array :");
        int target = sc.nextInt();
       System.out.println(elementSearch(arr, target));
    }    
}
