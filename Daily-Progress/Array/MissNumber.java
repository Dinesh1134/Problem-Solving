public class MissNumber {
        public static int missNumber(int arr[]){
        // int total=0, sum=0;
        // for(int i=0; i<arr.length; i++){
        //     sum+=arr[i];
        // }

        // for(int i=1; i<=arr.length+1; i++){
        //     total+=i;
        // }
        // return total - sum;

            long sum=0, n=arr.length+1;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }
            long total = n*(n+1)/2;
        return (int)(total - sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        System.out.println(missNumber(arr));
    }
}
