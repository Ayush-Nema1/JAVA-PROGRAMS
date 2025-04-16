import java.util.*;

public class QueueQ {
//Queue usning two stack
//     static class Queue {
//     Stack<Integer>s1 = new Stack<>();
//     Stack<Integer>s2 = new Stack<>();
//     public  boolean isEmpty(){
//      return s1.isEmpty();
//     }
//     public void add (int data){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()){
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }
//     }
//     public int remove(){
//         if(isEmpty()){
//          return -1;
//         }
//       int first =   s1.pop();
//   return first;
//     }
//     public int  peek (){
//         if(isEmpty()){
//             return -1;
//            }
//            return s1.peek();
//     }
//     }

//FIND FIRST NON REPEATING LETTER IN A  STTRING
/* 
public static void nonrepeat(String str){
    int freq[] = new int[26];
    Queue<Character> q = new LinkedList<>();
    for(int i= 0 ;i<str.length();i++){
    char ch = str.charAt(i);
    q.add(ch);
    freq[ch - 'a']++;
 while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
    q.remove();
 }
 if(q.isEmpty()){
    System.out.println("-1" );
 }else{
    System.out.println(q.peek());
 }
    }
}
    */

//REVESAL OF QUEUE
public static void reversal(Queue<Integer>q){
    Stack<Integer>s = new Stack<>();
    while(!q.isEmpty()){
       s.push(q.remove());
    }
    while(!s.isEmpty()){
        q.add(s.pop());
    }
    
}

//Interleave two halves 
public static void interleave(Queue<Integer>q){
    Queue<Integer>q1 = new LinkedList<>();
    int size = q.size();
    for(int i= 0 ;i<size/2;i++){
        q1.add(q.remove());
    }
    while(!q1.isEmpty()){
        q.add(q1.remove());
        q.add(q.remove());
    }
}

//Generate Binary Numbers
public static void generatebinary(int n){
Queue<Integer>q = new LinkedList<>();
q.add(1);
    for(int i = 2;i<=n;i++){
    int curr = i;
    int bin = 0;
    int power = 0;
    while(curr > 0){
        int rem = curr%2;
        curr = curr/2;
bin = (bin + (rem *(int)Math.pow(10, power)));

power++;
    }
q.add(bin);
}    
while(!q.isEmpty()){
    System.out.print(q.remove() + " ");
}
}
    public static void main(String[] args) {
//QUEUE USING STACKS
/* 
            Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
            */
//FIND FIRST NON REPEATING LETTER IN A  STTRING  
/* 
            String str = "aabccxb";
            nonrepeat(str);
            */
//Queue Reversal
/* 
Queue<Integer>q = new LinkedList<>();
q.add(1);      
q.add(2);      
q.add(3);      
q.add(4);
reversal(q);      
while(!q.isEmpty()){
 System.out.print(q.remove() + " ");
 */
//Generate Binary Numbers
generatebinary(5);
 //Interleave two halves
 /* 
Queue<Integer>q = new LinkedList<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
interleave(q);
while(!q.isEmpty()){
    System.out.print(q.remove() + " ");
    */
}
}


