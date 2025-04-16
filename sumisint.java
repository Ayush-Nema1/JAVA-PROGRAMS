import java.util.Scanner;

public class sumisint {
    public static int check (int n){
     int sum = 0;
     while ( n > 0){
     int lastd = n%10;
     n /= 10;
     sum += lastd;
     }
     return sum;
    }
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
   int result  = check(n);
   if (result > 0){
    System.out.println("No is integetr and no. is = " + (result));
   }
    }
    
}
