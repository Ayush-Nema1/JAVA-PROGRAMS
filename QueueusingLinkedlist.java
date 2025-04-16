public class QueueusingLinkedlist {

    static  class Node{
        int data;
         Node next;
         Node(int data) {
         this.data = data;
         this.next = null;
        }
        }
static class Queue {
    static Node head;
    static Node tail;
   public static boolean isEmpty(){
    return head == null;
   }
   //add
   public void add(int data){
   Node newnode = new Node(data);
   if(head == null){
    head = tail = newnode;
   }
 else{
    tail.next = newnode;
    tail = newnode;     
}
}
//remove 
public int remove(){
    if(isEmpty()){
        return -1;
    }
    int front = head.data;
    head = head.next;
    return front;
}
//peek
public int peek(){
    if(isEmpty()){
        return -1;
    }
    return head.data;
}
   }
   public static void main(String[] args) {
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
while(!q.isEmpty()){
System.out.println(q.remove());
}
    } 
}
    
