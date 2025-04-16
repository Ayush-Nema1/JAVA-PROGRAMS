

public class Strings {
    public static String prefixs(String strs []){
        String reference = strs[0];

        for(int i = 0; i<reference.length();i++){
            char curr_ch = reference.charAt(i);
        
            for(int j = 1; j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i)!=curr_ch){
                    return strs[j].substring(0, i);
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        //Palindrome
/*     
        String str = "noon";
    for(int i =0; i<=str.length()/2;i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            System.out.println("sting is not pailndrome");
            return;
        }
    }
    System.out.println("string is palindrme");
*/   
        //Route (E,w,n,s)
/*  
    String str = "WNEENESENNN";
    int x = 0;
    int y = 0;
    for(int i = 0 ;i< str.length();i++){
        char ch = str.charAt(i);
        if(str.charAt(i) == 'W'){
        x--;
        }
        else if(str.charAt(i)=='N'){
            y++;
        }
        else if(str.charAt(i)=='S'){
            y--;
        }
        else if(str.charAt(i)=='E'){
            x++;
        }
        
    }
    System.out.println(x + "," + y);
    int x2 = (x*x);
    int y2 = (y*y);
    int shortest_distance = (int)Math.sqrt((x2+y2));
    System.out.println(shortest_distance);
 */
        //USe of compare function 
/*   
        String Fruits[] = {"apple","orange","mango"};   
     String largest = Fruits[0];
     for(int i = 1;i<Fruits.length;i++){
        if (largest.compareTo(Fruits[i]) < 0){
            largest = Fruits[i];
        }
     }
     System.out.println(largest);
*/
 //to uppercase
 /* 
 String str = "hey i am ayush nema";    
 StringBuilder sb = new StringBuilder("");
 sb.append(Character.toUpperCase(str.charAt(0)));   
 for(int i = 1; i<str.length();i++){
       if(str.charAt(i)== ' ' && i < str.length()-1){
       sb.append(str.charAt(i));
       i++;
       sb.append(Character.toUpperCase(str.charAt(i)));
       }
       else {
        sb.append(str.charAt(i));
       }
     }
     System.out.println(sb);
     
*/         
//compression of string 

String str = "aabbbccdddefff";
StringBuilder newstr = new StringBuilder("");

for(int i = 0 ; i< str.length();i++){
Integer count = 1;
while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
  count++;
  i++;
} 
 newstr.append(str.charAt(i));
if(count > 1){
    newstr.append(count.toString());
}
}
System.out.println((newstr));


//question foe vowel occurnces
/* 
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int count = 0;
for(int i = 0;i< str.length();i++){
   if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'  ) {
    count++;
   }
}
System.out.println(count);
*/
// Anagrams question
/* 
String str1 = "Earth";
String str2 = "Heart";
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();
if(str1.length() == str2.length()){
    
char s1[] =  str1.toCharArray();
char s2[] = str2.toCharArray();

Arrays.sort(s1);   
Arrays.sort(s2);

boolean result = Arrays.equals(s1, s2);
if(result){
System.out.println(str1 + "  or  " +  str2 + " are awnagrams ");
}
else{
    System.out.println(str1 + "," + str2 +"are not anagrams");
}

}
else{
    System.out.println("not anagrams");
}
*/
//Prefix longestccombinaation 
//String strs[] ={"flowers","flow","flight"};
//System.out.println(prefixs(strs));



}
}

