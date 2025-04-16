public class bintodec {
    public static int btod(int n){
int decimal = 0;
int power = 0;
while (n > 0) {
    //for lastdigit       
    int last = n % 10;
            decimal = decimal + (last * (int) Math.pow(2,power));
            power++;
            n = n/10;
       }
         return decimal;
    }
    public static void main(String [] args){
        System.out.println(btod(101));
    }
}