
import java.util.Scanner;

public class palindrome {
    public static boolean isp(int n){
    boolean ispa = false;
  int reversed = 0;
  int og = n;
      while (n>0){
       //for last digit like remainder
        int lastd = n% 10;
      //to make no. short
        n = n/10;
      reversed = (reversed * 10) + lastd;    
   }
   if (reversed == og){
    ispa = true;
   }
   return ispa;
}


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isp(n));    
    }
    
}
