
public class Array {
//Linear search 
/*
     public static int linear_search(int number[],int key){
for (int i = 0; i< number.length;i++){
    if (number[i]==key){
        return i;
    }
}
    return -1;
}
  

*/
//Largest and Smallest Number 
/*
     public static int largest_smallest(int number[]){
    int Largest = Integer.MIN_VALUE; // -infinity
    int Smallest = Integer.MAX_VALUE; // maximum value +infinity

    for (int i = 0; i<number.length;i++){ 
    if(number[i]>Largest){
        Largest = number[i];
    }
   if(number[i]<Smallest){
    Smallest = number[i];
    }
    }
    System.out.println("smallest is = "+ Smallest);
   return Largest;
    }

     */
//Binary Search
/*
    public static int Binary(int number [],int key){
int start = 0;
int end = number.length-1;
   
 while(start<=end){
 int mid = (start+end)/2;
if (number[mid]==key){
    return mid;
}
else if (number[mid]<key){
   start = mid+1;
}
else{
    end = mid-1;
}

    }
    return -1;
}
*/
//Reverse An Array
/*
        public static void reverse (int number[]){
            int start =0;
            int last = number.length-1;
            while(start < last){
                int temp = number[last];
                number[last] = number[start];
                number[start] = temp; 
                start++;
                last--;
            }

        } 
*/
//Pairs of Array
/*
    public static void pair(int numbers[]){
        for (int i = 0; i<numbers.length;i++){
            int curr = numbers[i];
        for (int j = i+1; j<numbers.length;j++){
            System.out.print("(" + curr +  "," + numbers[j]  +")");
        }System.out.println();    
        }
    }        
*/  
//Sub-Arrays and sum largest nad lowest 
/*
           public static void subarrays(int numbers[]){
         int sum = 0;
         int maxsum = Integer.MIN_VALUE;
         int minsum = Integer.MAX_VALUE;
            for(int i = 0; i<numbers.length;i++){
        //start = i    
        for(int j = 1;j<numbers.length;j++){
            //end j ye i=1 ke liye j 0 1 2 3 4 
            for (int k = i; k<=j;k++){
                sum += numbers[k];
                System.out.print(" "+ numbers[k]);
             
            }System.out.println();
            System.out.println( "the sum of sub array is = "+ sum);
            if(maxsum < sum){
                maxsum = sum;
            }
            
            if(minsum>sum){
                minsum = sum;
            }
            sum = 0;
        }
     }

     System.out.println("minimum value is = "+ minsum);
     System.out.println("maximum value is ="+   maxsum);
    }
 */ 
//Prefix  Sum
/*
//     public static void prefixsum(int numbers[]){
//        int currsum = 0;
//        int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//        prefix[0] = numbers[0];
//        for(int i = 1 ;i<numbers.length;i++){
//         prefix[i] =prefix[i-1] + numbers[i];  
//        }
       
//        for(int i = 0 ;i<numbers.length;i++){
//         for(int j = i;j<numbers.length;j++){
//         currsum = (i == 0) ? prefix[j] :  prefix[j] - prefix[i-1];
//     if (maxsum < currsum){
//         maxsum = currsum;
//     }
//     }
        
//        }
    

// System.out.println("maximum sum is " + maxsum);
//     }    
*/
//KADANES
/*
           public static  void kandanes(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0 ; i<numbers.length;i++){
        
        currsum += numbers[i];

        if(currsum> maxsum){
            maxsum = currsum;
        }
        if (currsum < 0){
            currsum = 0;
        }
        
        }
        System.out.println(maxsum);
    }
 */
//if all are neagvite in kandes array
 /*
     public static void kandanes(int numbers[]){
     int maxsum = Integer.MIN_VALUE;
     int currsum = 0;
     int maxelement = Integer.MIN_VALUE;


     for(int i = 0; i<numbers.length;i++){
     
    currsum += numbers[i];
    maxelement = Math.max(numbers[i],maxelement);
    maxsum = Math.max(currsum, maxsum);
    if(currsum < 0){
        currsum = 0;
    } 

    if (maxsum <=0){
     maxsum = maxelement;   
   
 }
 


     }

System.out.println(maxsum);
     }

*/    
// Question Buy and Sell Stock
/*
public static int Buystock(int number[]){
int maxprofit =0;
int buyprice = Integer.MAX_VALUE;
for(int i = 0 ;i<number.length;i++){
    if (buyprice < number[i]){
    int profit = number[i] - buyprice;
    maxprofit = Math.max(maxprofit, profit); 
    }
    else{
        buyprice = number[i];
    }

}
return maxprofit;
}
*/
//distinct number in array 
/* 
public static void  track(int numbers[]){
    boolean distinct = true;
    for(int i = 0;i<numbers.length;i++){
        for(int j = 0; j<numbers.length;j++){
            if( i!=j && numbers[i] == numbers[j]){
                distinct  = false;
                System.out.println("Arrays are duplicate");
                return;
            }
        }
    }
  if(distinct){
    System.out.println("All are distinct");
  }
}
 */ 
//Pivot Rotate Array
/* 
public static void rotate(int numbers[]){
    int point = 3;
    int target = 15;
    int pivotarr[] = new int [numbers.length];
    int j = 0;
    for(int i = point; i<numbers.length;i++){
       pivotarr[j] = numbers[i];
       j++;
    }
    for(int i = 0;i<point;i++){
        pivotarr[j] = numbers[i];
        j++;
    }
    for(int i = 0; i<pivotarr.length;i++){
      
        System.out.println(pivotarr[i]); 
        
    
    }

}
*/
 public static void main(String[] args) {
//Input of array
/*
 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks [] = new int [n];
        for(int i = 0; i<marks.length;i++){
            marks[i] = sc.nextInt();
        }        
        for(int i = 0 ;i<marks.length;i++){
            System.out.println(marks[i]);
        }
     
         */
//linear search
 /*
    int key = 10; 
       int number[] = {2,4,6,8,10,12,14,16};
       int result = linear_search(number, key);
       if(result==-1){
       System.out.println("not found  = ");
       }
       else{
       System.out.println(" present at = "+ result);
       }
         */
//Largest and Smallest Number Find 
 /*
    
      int number[] = {1,2,5,7,25,4,0,655};
      System.out.println( largest_smallest(number));

         */
//Binary search question
 /*
         int numbers [] = {2,4,6,8,10,12,14,16};
         int key = 100;
         int result = Binary(numbers, key);
         if (result == -1){
            System.out.println("Number in array is not found");
         }
         else{
            System.out.println("found at = "+ result);
         }
  
        
   */                
//Reverse an array
/*
       int numbers [] = {2,4,6,8,10};
       reverse(numbers);
       for (int i = 0; i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
        System.out.println();
*/                  
//Pairs of array  
/*
          int numbers[] = {2,4,6,8,10};
         pair(numbers); 
*/
//subarrays
/*
    int numbers [] = {2,4,6,8,10};
    subarrays(numbers);
*/     
//prefix sum
/*
      int numbers [] = {2,4,6,8,10};
        prefixsum(numbers);
    
*/
//KADANES algogithm
/*
     int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
     kandanes(numbers);
*/
//if all are neagvite in kandes array
/*
    int numbers [] = {-1,-2,-3,-4};
     kandanes(numbers);
*/
// Question Buy and Sell Stock
/*
int number[] = {7,1,5,3,6,4};
System.out.print(Buystock(number));
*/
//Distinct Array
/* 
int numbers[] = {1,2,3,4,5};
track(numbers);
*/
//Pivot Rotate Array
/* 
int numbers[] = {0,1,2,4,5,6,7};
rotate(numbers);
*/
// Remove duplicates
/* 
class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length ==0){
        return 0;
    }
    int j = 0;
    for(int i = 1; i<nums.length;i++){
        if(nums[i]!= nums[j]){
            j++;
            nums[j] = nums[i];
        }
    }
    return j+1;
    }
}

*/
/*     
int arr []={2,4,6,8,10};
for(int i = 0 ; i<arr.length;i++){
    for(int j = 0; j<= i;j++){
        System.out.print(arr[j]);
    }
    System.out.println();
}


*/
}

    }
