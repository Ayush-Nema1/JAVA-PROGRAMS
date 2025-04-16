//Implementation of stack by LinkedList
public class StackB {
    static class Node{
        int data;
        Node next;
   
           public Node(int data) {
            this.data = data;
            this.next = null;
           }
       
       }
    static class stack{
        static Node head = null;
        //isempty
        public static boolean isempty (){
            return head == null;
        }
        //push 
        public static void push(int data){
            Node newnode = new Node(data);
            if(isempty()){
            head = newnode;
            return;
            }
            newnode.next = head;
            head = newnode;
        }
    //pop
    public static int pop(){
    if(stack.isempty()){
    return -1;
 }
 int top = head.data;
 head = head.next;
 return top;
    }
    //seek 
    public static int seek(){
        if(stack.isempty()){
            return -1;
         }
         return head.data;
    }

       
    }
public static void main(String[] args) {
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(3);
  while(!stack.isempty()){
System.out.println(stack.seek());  
stack.pop();
}
}

}
