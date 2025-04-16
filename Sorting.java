public class Sorting {
//Bubble sort
/* 
public static void Bubblesort(int arr[]){
    for(int i = 0 ; i<arr.length-1;i++){
        for (int j = 0; j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
    
}
*/
//Selection Sort
/* 
public static void Selectionsort(int arr[]) {
    for(int i = 0; i<arr.length-1;i++){
        int minposition = i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[minposition] > arr[j]){
                minposition = j;
            } 
        }
        int temp = arr[minposition];
        arr[minposition] = arr[i];
        arr[i] = temp;
    }
}
*/    
//Insertin sort 

public static void insertion(int arr[]){
    for(int i = 1 ; i < arr.length;i++){
    int curr = arr[i];
    int prev = i-1;
    while(prev>=0 && arr[prev]> curr){
        arr[prev+1] = arr[prev];
        prev--;
    }
    arr[prev + 1] = curr; 
    } }
  
//Counting sort
/* 
public static void Countingsort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length;i++){
        largest = Math.max(arr[i], largest);
    }
    // frequency kitni baar aa gaya
    int count[] = new int[largest+1]; 
    for(int i = 0; i<arr.length;i++){
    count[arr[i]]++;
    }
    int j = 0;
    for(int i = 0;i<count.length;i++){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }

}
 */
public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    // int largest  = Integer.MIN_VALUE;
    //  for(int i = 0;i<arr.length;i++){
    //     largest = Math.max(arr[i],largest);
    //  }
    //  int count [] = new int[largest+1];
    //  for(int i = 0; i<arr.length;i++){
    //     count[arr[i]]++;
    //  } 
    //  int j = 0;
    //  for(int i = count.length-1 ; i>=0;i--){
    //  while(count[i]>0){
    //     arr[j] = i;
    //     count[i]--;
    //     j++;
    //  }
    // }

 
    //     
    insertion(arr);
    for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i]);
                          }
    
}
 
}