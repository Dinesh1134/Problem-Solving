public class SecondEle {
    public static int secondElement(int arr[]){
        //Better Approach
        // int largest = 0, second = -1;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>largest)
        //         largest = arr[i];
        // }
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>second && arr[i]!=largest)
        //         second=arr[i];
        // }
        // return second;

        //Optimized Approach
        int largest = arr[0], second = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]> largest){
                second = largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
                
        }
        return second;
    }

    public static int secondSmallest(int arr[]){
        int smallest = arr[0], secondSmallest = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<smallest && secondSmallest<arr[i]){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int arr[] = {11,28,44,17,7,65};
        System.out.println(secondElement(arr));
        System.out.println(secondSmallest(arr));
    }
}
