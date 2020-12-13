public class Question3{
    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == x)
                return i;
        }
       return -1;
    }
 
    public static void main(String args[]){
        int arr[] = {1,34,2,4,6,4,6,7,0,9,8};
        int x = 6;

        int result = search(arr, x);
        if (result == -1)
            System.out.println("Element "+x+" is not present in array");
        else
            System.out.println("Element "+x+" is present at index "+ result);
    }
}