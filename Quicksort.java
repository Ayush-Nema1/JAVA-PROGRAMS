public class Quicksort {

    public static void sort(int arr[] , int st , int en){
    if(st >= en){
        return;
    }
    //kaam hua ye partition kar raha hai ascending or decending order me  bich wale ke aage wale use chote uske baad wale us se bade
    int idx = partition(arr, st, en);
  //ye recuseive call sort karne ke liye ye sort kar ke aas jaye gi faith1
    sort(arr, st, idx-1);
    sort(arr, idx+1, en);
    }
    public static int partition(int arr[] , int st , int en){
        int pivot = en;
        int i = st-1;
        for(int j = st ; j < en ; j++ ){
         if(arr[j] < arr[pivot]){
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
         }
        }
        i++;
        int temp = arr[en];
        arr[en] = arr[i];
        arr[i] = temp;
         return  i;
    }
    public static void print (int arr[]){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
         int en = arr.length-1;
         sort(arr, 0, en);
         print(arr);
        }
    
}
