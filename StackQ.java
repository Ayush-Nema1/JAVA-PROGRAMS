import java.util.Stack;

public class StackQ {
//Push at Bottom 
/*
  
    public static void pushatbottom(Stack<Integer>s ,int data){
        if(s.isEmpty()){
        s.push(data);
        return;
 }
 int top = s.pop();
 pushatbottom(s , data);
 s.push(top);
    }
 */
//reverse a string 
/* 
    public static String reverse(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("" );
        while(!s.isEmpty()){
        char curr = s.pop();
        sb.append(curr);
        }
        return sb.toString();
    }
        */
//Reverse a stack
/*
public static void reversestack(Stack<Integer>s){
    if(s.isEmpty()){
        return;
    }
    int top = s.pop();
    reversestack(s);
    pushatbottom(s, top);
}
public static void print(Stack<Integer>s){

    while(!s.isEmpty()){
    System.out.print( s.pop() + " ");
    
    }
    System.out.println();
}
    */
//stock span
/*     
public static void stocksspan(int stocks[],int span[]){

    Stack<Integer>s = new Stack<>();
    span[0] = 1;
    s.push(0);
    for(int i = 1; i<stocks.length;i++){
        int currprice = stocks[i];
        while(!s.isEmpty() && currprice> stocks[s.peek()]){
            s.pop();
        }
     
        if(s.isEmpty()){
            span[i] = i+1;
        }else{
            int prevHigh = s.peek();
            span[i] = i - prevHigh;
        }
 
        s.push(i);
    }
}
    */
public static boolean removeduplicate(String str){
Stack<Character> s = new Stack<>(); 
   for(int i = 0;i<str.length();i++){
 char ch = str.charAt(i);   
if(ch == ')'){
    int count = 0;
    while(!s.isEmpty()&&s.peek() != '('){
      s.pop();
      count++;
    }
    if(s.isEmpty()){
        return false;
    }
    if(count < 1){
        return true;
    }
    else{
        s.pop();
    }
}else{
    s.push(ch);
}
}

    return false;
}
    public static void main(String[] args) {
/* 
        //Stack<Integer> s = new Stack<>(); 
//         s.push(3);
//         s.push(2);
//         s.push(1);
//         pushatbottom(s, 4);
//         while(!s.isEmpty()){
// System.out.println(s.peek());
// s.pop();
//         }
//     }
*/
//Reverse a String
/* 
String str = "abc";
String result = reverse(str);
System.out.println(result);
*/
/* 
Stack<Integer>s = new Stack<>();
s.push(1);
s.push(2);
s.push(3);
reversestack(s);
print(s);
 */
// stock span problem
/* 
int stocks[] = {100,80,70,60,70,60,85,100};
int span [] = new int[stocks.length];
stocksspan(stocks,span);

for(int i =  0;i<span.length;i++){
    System.out.println(span[i] + " ");
*/
//NextGreater element 
/* 
int arr[] = {6,8,0,1,3};
int NextGreater[] = new int[arr.length];
Stack<Integer> s = new Stack<>();
for(int i = arr.length-1 ; i>=0;i--){
    while(!s.isEmpty() &&arr[s.peek()] <=arr[i] ){
        s.pop();
    }
    if(s.isEmpty()){
        NextGreater[i] = -1; 
    }
    else{
        NextGreater[i] = arr[s.peek()];
    }
    s.push(i);
}
for(int i=0;i<NextGreater.length;i++){
    System.out.print(NextGreater[i] + " ");
}
System.out.println();
*/
//Duplicate parnthesis
//String str = "(b)";
//System.out.println(removeduplicate(str));
//Maximum area of rectangle in histogram
Stack<Integer> s= new Stack<>();
int arr[] = {2,1,5,6,2,3};
int rsm[] = new int[arr.length];
int lesm[] = new int[arr.length];
for(int i = arr.length-1; i>=0;i--){
    while(!s.isEmpty()&&arr[s.peek()] >= arr[i] ){
        s.pop();
    }
    if(s.isEmpty()){
        rsm[i] = arr.length;
    }
    else {
        rsm[i] = s.peek();
    }
    s.push(i);
}
s = new Stack<>();
for(int i =0; i<arr.length;i++){
    while(!s.isEmpty()&&arr[s.peek()] >= arr[i] ){
        s.pop();
    }
    if(s.isEmpty()){
        lesm[i] = -1;
    }
    else {
        lesm[i] =s.peek();
    }
    s.push(i);
}
int MAX = 0;
for(int i = 0;i<arr.length;i++){
    int height = arr[i];
    int width = rsm[i] - lesm[i] - 1;
    int currarea = height * width;
     MAX = Math.max(MAX, currarea);
}
System.out.println(MAX);

}
}

