public class CheckSort {
    public static boolean sortArray(int arr[]){
        int element = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=element){
                element = arr[i];
            }
            else {
                return false;
            }  
        }
        return true;
    }

    public static int removeDupArray(int arr[]){
        int i=0;
            for(int j=1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    arr[i+1]=arr[j];
                    i++;
                }
        }
            return i+1;
    }

    public static boolean checkSortWithRotate(int arr[]){
        int n = arr.length,count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
            if(count > 1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,3,4};
        System.out.println(removeDupArray(arr));
        System.out.println(sortArray(arr));
        System.out.println(checkSortWithRotate(arr));
    }
}
