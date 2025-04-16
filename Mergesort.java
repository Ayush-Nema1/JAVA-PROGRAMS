public class Mergesort{

    public static void mergesort(int arr[],int st ,int en){
    if(st>=en){
        return ;
    }
    int mid = (st + en) / 2 ;
    mergesort(arr, st, mid);
    mergesort(arr, mid+1, en);
    merge(arr , mid ,st,en);
}
public static void merge(int arr[],int mid , int st, int en ){
    int temp[] = new int [(en-st)+1];
    int i = st;
    int j = mid+1;
    int k = 0;
while (i <= mid && j <= en){
    if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
    }
    else{
        temp[k] = arr[j];
        j++;
    }
    k++;
}
while(i<=mid){
    temp[k++] = arr[i++];  
}
while(j <= en){
    temp[k++] = arr[j++];
}

for(k=0,i=st;k<temp.length;k++,i++){
    arr[i] = temp[k];
}
}
public static void print(int arr[]){
    for(int i = 0 ;i< arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

    public static void main (String[] args){
    int arr[] = {5,1,3,2,4};
    int en = arr.length-1;
        mergesort(arr, 0,en);
        print(arr);
    }}