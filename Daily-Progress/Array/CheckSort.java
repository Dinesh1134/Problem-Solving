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

    
    public static void main(String[] args) {
        int arr[] = {2,4,4,6,8,8};
        System.out.println(removeDupArray(arr));
    }
}
