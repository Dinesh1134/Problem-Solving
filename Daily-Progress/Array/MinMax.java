import java.util.ArrayList;

public class MinMax {
    public static ArrayList<Integer> getMinMax(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 15, -7, 9};

        System.out.println(getMinMax(arr));
    }
}
