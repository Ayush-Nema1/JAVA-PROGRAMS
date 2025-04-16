public class QueueCircular {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
        arr = new int[n];
        size = n;
        rear  = -1;
        front = -1;
    }
    //isempty
    public static boolean isEmpty(){
     return rear == -1 && front == -1;
    }
    //isfull
    public static boolean isfull(){
        return (rear+1)% size == front; 
    }
    //add
    public void add(int data){
        if(isfull()){
            System.out.println("sull");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }    
    //remove
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int result = arr[front];
   
       
        if(rear == front){
            rear = front = -1;
        }else{
            front = front+1;
        }
return result;
    }

    }
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.add(1);
        System.out.println(q.remove());
        q.add(2);
        System.out.println(q.remove());
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
         
         }
    }
}
