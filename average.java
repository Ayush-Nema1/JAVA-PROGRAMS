import java.util.Scanner;

public class average { 
    public static int ave(int a){
        if (a%2==0){
            return  1;
        }
        else return  2;
    }
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int result = ave(a);
    System.out.println(result);
    }
}