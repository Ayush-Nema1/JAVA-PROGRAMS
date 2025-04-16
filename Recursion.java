

public class Recursion {
 //Decreaseing number    
   
    public static void printdec(int n){
   if(n== 1){
    System.out.println(n);
    return;
   }
    System.out.println(n);
    printdec(n-1);
   }
  
 //Incresing nnumber 

 public static void printInc(int n){
    if( n== 1){
        System.out.print(n + " ");
        return;
    }
    printInc(n-1);
    System.out.print(n + " ");
 } 

//Factorial of a number 

 public static int factorial(int n){
    if (n == 0){
     
        return 1;
    }
   
  int factn1 = (int)factorial(n-1);
   int fact  =  n * factn1;
   return fact;
 
}  
   
//Sum of n natural number 
public static int sum (int n){
if(n == 1){
    return 1 ;
}
int nm1 = sum(n-1);
int tsum = n + nm1;
return tsum;
}
//Fibnoci series 
public static int fibnoci(int n) {
    if(n == 1 || n == 0){
        return n;
    }
    int fibnm1 = fibnoci(n-1);
    int fibnm2 = fibnoci(n-2);
    return fibnm1 + fibnm2;
} 

//Sorted or not 
public static boolean issorted(int array[],int i){
 if(i == array.length-1){
    return true;
 }
    if(array[i] > array[i+1]){
    return false;
 }   
 return issorted(array, i+1);
}

// First occurance

public static int firstocurance(int array[] , int key , int  i){
   if(i == array.length){
      return -1;
   }
   
   if(array[i] == key){
      return i;
   }
   return firstocurance(array, key, i+1);
}

public static int lastoccr(int arr[], int key , int i){
if(i == arr.length){
   return -1;
}


// Last occurance

int isfound = lastoccr(arr, key, i+1);
if(isfound != -1 ){
   return isfound;
}
if(arr[i] == key){
   return i;
}
return isfound;
}

// power calculation 
public static int powerr(int n , int a){
   if(a == 0){
     return 1 ;
   }
   int nm1 = powerr(n, a-1);
   int pow = n * nm1;
   return pow;
}

//(optimizided way of power calculation)
public static int oppower(int x , int n){
   if(n == 0){
return 1;
   }
   int halfpower = oppower(x, n/2);
   int halfpowersq = halfpower*halfpower;
   if(n%2 != 0 ){
      halfpowersq = x * halfpowersq;
   }
   return halfpowersq;
}

//Decreasing than increasing 
public static void indi(int n){
   if(n == 1){ 
      System.out.println(n);
      return;
   }
System.out.println(n);
indi(n-1);
System.out.println(n);

}

//remove duplicates from string 
public static void removedup(String str , int idx,StringBuilder sb , boolean map[]){
if(idx == str.length() ){
   System.out.println(sb);
   return;
}
char curr = str.charAt(idx);
if(map[curr - 'a'] == true){
    removedup(str, idx+1, sb, map);
}
else { 
 map[curr - 'a'] = true;
 removedup(str, idx+1, sb.append(curr), map);
}

}

//Pair of freinds in party yani chutiyapa
public static int pair(int n){
   if(n==1||n==2){
      return n;
   }
   //phela banda yani (A B C ) (A) akela khada hai tu
   int fm1 = pair(n-1);
  // A ho gya bore usko chiya banda ya bandi to usne dudha ek ko ab bache
  int fm2 = pair(n-2);
 //bo kis kis ke pass jas sakta hai 
  int pairways = (n-1) * fm2;
  int toways = fm1 + pairways;
  return toways;
}

// Tile rako majduri karo 
public static int tile(int n){
   if(n == 0 || n == 1){
      return 1;
   }
   // verical 
   int fm1 = tile(n-1);
   // horizontal
   int fm2 = tile(n-2);
    
   int totalways = fm1 + fm2;
   return totalways;
 }

 //Last place of binay without consecutive one

public static void binary (int n , int lastplace, String str){
   if( n == 0){
      System.out.println(str);
      return;
   }
   binary(n-1, 0 , str+"0");
   if(lastplace == 0){
      binary(n-1, 1, str+"1");
   }
}
public static void allocc(int arr[],int key , int idx){
   if(idx == arr.length){
      return;
   }
   if(arr[idx] == key){
      System.out.print(idx + " ");
   }
   allocc(arr, key, idx+1);
}

  // Tower of Hanoi //

  public static void toh (int n ,int A,int C , int B ){
   if(n == 0){
      return;
   }
   toh(n-1, A, B, C);
   System.out.println(n+" disk is place from  " + A +" to " +" " + C  );
   toh(n-1, B, C, A);
}

//Print number into spelling String 

public static String converttostring(int n){
   String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
   if(n == 0){
      return "";
   }
   String nm1 = converttostring(n/10);
   String nm =  digits[n%10];
   return (nm1 +" "+ nm);
}

//Length of a String using recursion





public static void lengthofString(String str,int i,int count){
   if(i == str.length()){
  System.out.print(count);
  return;
   }
   
   lengthofString(str,i+1, count+1);
}

//find the count of all contiguous substrings starting and ending with same letter 
public static int count(String str , int st ,int en){
if(st > en){
   return 0;
}
//isme phela letter chod kar sare ki substring laye ga 
int firsttcharremoved = count(str, st+1, en);
//ye last ke phele ki laye ga
int lastremove = count(str, st, en-1);
//ye jo aa  chuki hai 2 barr unklo hatne ke liye
int similar = count(str, st+1, en-1);

int ans = firsttcharremoved + lastremove - similar;
if(str.charAt(st) == str.charAt(en)){
   ans++;
}
return ans;


}




public static void main(String args[]){
// printdec(10);
// printInc(5);
//int res = factorial(5);
//System.out.println(res);  
//System.out.println(sum(5));
//System.out.println(fibnoci(11));
//int arr[] = {1 ,6,3,3,4,5,5,6};
//System.out.println(lastoccr(arr, 5, 0));
//System.out.println(powerr(2, 5));
//System.out.println(oppower(2, 5));
//indi(5);
//String str = "appnnacollege";
//boolean map[] = new boolean[26];
//removedup(str, 0, new StringBuilder(""), map);
//System.out.println(pair(3));
//System.out.println(tile(3));
//binary(3, 0, "");
//int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//allocc(arr, 2, 0);  
toh(3, 10, 30, 20);
//String result = converttostring(1947);
//System.out.println(result);
//lengthofString("Ayush nema", 0, 0);
// String str = "abcab";
// int n = str.length()-1;
// int ans = count(str,0,n);
// System.out.println(ans);
}





}
