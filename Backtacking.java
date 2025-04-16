public class Backtacking{
   public static void print(int arr[]){
     for(int i =0 ;i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
   }

   public static void backprint(int arr[],int i , int val){
if(i == arr.length){
    print(arr);
    return;
}

//recursion
  arr[i] = val;
  backprint(arr, i+1, val+1);
  arr[i] = val-2;
}


//Find Subset of a string 
public static void findsubset(String str ,StringBuilder st,int i){
if(i == str.length()){
    System.out.println(st);
return;
}


//string ke phlkele wale ko subset me ana hai means yes
st.append(str.charAt(i));
findsubset(str, st, i+1);
//nahi ana subset me
st.deleteCharAt(st.length() - 1);
findsubset(str, st, i+1);

}

//permutation of a String 
public static void permutation(String str , String ans){
if(str.length() == 0 ){
   System.out.println(ans);
   return;
}
for(int i = 0 ;i<str.length();i++){
 
   char curr  = str.charAt(i);
   String newstr = str.substring(0,i)+ str.substring(i+1);
   permutation(newstr, ans+curr);

}

}
//Grid ways 
public static int grid(int i,int j, int n,int m){
if(i == n || j == m){
   return 0;
}else if(i == n-1 && j == m-1){
   return 1;
}

int w1 = grid(i+1, j, n, m);
int w2 = grid(i, j+1, n, m);
return  w1+w2;
}




    public static void main(String[] args) {
//  int arr[] = new int[5];
//  backprint(arr, 0, 1);       
//  print(arr);
//  StringBuilder st = new StringBuilder("");
//  str = "abc";
//  findsubset(str, st, 0);
//  permutation("abc", "");
System.out.println(grid(0, 0, 3, 3));  
 
}
}

