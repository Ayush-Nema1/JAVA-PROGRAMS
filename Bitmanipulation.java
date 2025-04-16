public class Bitmanipulation {
     public static void main (String args[]){
//odd number 
/* 
int bitmask = 1;
int n = 5;
if((1 & n ) == 0){
    System.out.println("even");
}
else{
    System.out.println("odd");
}
*/    
//Get ith bit
/* 
int bitmask = (1<<2);
int n = 15;
    System.out.println(n&bitmask);
*/
//set ith bit
/*
int bitmask = (1<<2);
int n = 3;
System.out.println(bitmask|n);
*/
//clear ith bit
/* 
int bitmask = ~(1<<1);
int n= 6;
System.out.println(n&bitmask);
*/
//clear lasts bit
/* 
int newbitmask = (~(0) << 2);
int n= 7;
System.out.println(n&newbitmask);
*/
//clear ranges of bits 
/* 
int j = 4, i = 2;
int a  = (~(0)<< j+1);
int b = (1<<i)-1;
int newbitmask = a|b;
System.out.println(10&newbitmask);
*/
//number is power of 2 or not 
/* 
int n = sc.nextInt();
if((n&(n-1))==0){
    System.out.println("number is power of 2");
}else {
    System.out.println("Number is not power of two");
}
*/
// count the set of bits 
/* 
int count = 0;
int n = 5;
int bitmask = 1;
while(n>0){
if ((n & bitmask)==1){
    count++;

}
    n = (n>>1);
}
System.out.println(count);
 */
//Fast Exponentiational 
/* 
int n = 3;
int power = 3;
int ans = 1;
int a = 1;
while(power > 0){
    if((power&1 ) == 1){
     ans =   n * ans;
  }
       n *= n ;
      power = power>>1;
      
}
System.out.println(ans);
*/

}
    }
