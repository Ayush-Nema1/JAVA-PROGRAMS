public class dectobin {
public static void convert (int n){
    int bin = 0;
    int power = 0;
    while(n > 0){
     int rem = n % 2;
        n /= 2;
        bin  = bin + (rem * (int)Math.pow(10, power) );
        power++;

    }
    System.out.println(bin);

}
    public static void main(String[] args) {
      convert(10);    
}
}
