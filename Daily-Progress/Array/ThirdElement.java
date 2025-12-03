public class ThirdElement {
    public static int thirdLargest(int arr[]){
        int largest = arr[0],secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=largest){
                thirdLargest = secondLargest;
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>=secondLargest && arr[i]<=largest){
                thirdLargest = secondLargest;
                secondLargest=arr[i];
            }else if(arr[i]>=thirdLargest && arr[i]<=secondLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }


    public static void main(String[] args) {
        int arr[] = {11,34,56,34};
        int arr1[] = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(thirdLargest(arr));

    }
}
