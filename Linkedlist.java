


public class Linkedlist{
    public static  class Node{
        int data ;
        Node next;

       public Node(int data){
        this.data = data;
        this.next = null;
       } 

    }
public static Node Head;
public static Node tail;
public static int size;

//Add First

public void addfirst(int data){
    Node newnode = new Node(data);
    size++;
    if(Head == null){
        Head = tail = newnode;
        return;
    }
    newnode.next = Head;
    Head = newnode;
}

//Add last

public void addlast(int data){
    Node newnnode = new Node(data);
    size++;
    if(Head == null){
        Head = tail = newnnode;
        return;
    }
    tail.next = newnnode;
    tail = newnnode;
}

// Print

public  void print(){
  Node temp = Head;
  while(temp != null){
    System.out.print(temp.data + " ");
    temp = temp.next;
     }
     System.out.println();
}

// Add middle
public  void add(int idx , int data){
    Node newnnode = new Node(data);
    size++;
    Node temp = Head;
    int i = 0;
    while(i< idx-1){
     temp = temp.next;
     i++;        
    } 
    newnnode.next = temp.next;
    temp.next = newnnode;
}
//Remove first

public int removefirst(){
    if(size == 0){
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;
    }else if(size==1){
       int val = Head.data;
       Head = tail = null; 
       size = 0;
       return val;
    }
    int val = Head.data;
    Head= Head.next;
    size--;
    return val;
}
//Remove last

public int removelast(){
    if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
       int val = Head.data;
       Head = tail = null; 
       size = 0;
       return val;
    }
    Node prev = Head;
    for(int i = 0;i<size-2;i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
//   Iterative search
 
public int search(int key){
Node temp = Head;
int i = 0;
while(temp!= null){
if(temp.data == key){
    return i;
}
i++;
temp = temp.next;
}
return -1;
} 

//Recurisve search
public int recsearch( Node Head, int key,int idx){
    if(Head == null){
        return -1;
    }
    if(Head.data == key){
    return idx;
    } 
  return   recsearch(Head.next, key, idx+1);
}
public int helper (Node head,int key){
    return recsearch(head, key,0);
}

//Remove Nth node  from End 
public void deletemthfromend(int n){
    int sz = 0;
    Node temp = Head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }
    int i = 1;
    int tofind = sz-n;
    Node prev =Head;
    while(i < tofind) {
        prev = prev.next;
    i++;
    }
    prev.next = prev.next.next;

}
//Reverse a linkedlist

public void reverse(){
    Node prev = null;
    Node curr =Head;
    Node next ;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    tail = Head;
    Head = prev;
}
//Pailndrome Linkedlist

public Node midp (Node Head){
    Node slow = Head ;
    Node fast = Head;
    while(fast != null && fast.next != null){
      slow = Head.next;
      fast = Head.next.next;
    }
    return slow;
}
public boolean checkPaildrome(){
    if(Head == null || Head.next == null){
        return true;
    }
Node mid  = midp(Head);
Node prev = null;
Node curr = mid;
Node next;
while(curr != null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr= next;
}
Node left  = Head;
Node right = prev;

while(right != null){
    if(left.data != right.data){
        return false;
    }
    left = left.next;
    right = right.next;
}
    
    
    return true;
}
//Detect loop/cyclic 
public static boolean  iscyclic (){
    Node slow = Head;
    Node fast = Head;
 
    while(fast != null && fast.next !=null){
        slow =  slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}
//Remove a cyclic node
public static void removecyclic(){
    //detect 
    Node slow = Head;
    Node fast = Head;
    boolean cyclic = false;
    while(fast != null && fast.next !=null){
        slow =  slow.next;
        fast = fast.next.next;
        if(slow == fast){
            cyclic = true;
            break;
        }
    }
    if (!cyclic) {
        System.out.println("No cycle detected.");
        return;
    }
    slow = Head;
    Node prev = null;
    while (slow != fast) {
        prev = fast;  // Track the node before 'fast'
        slow = slow.next;
        fast = fast.next;
    }
  
  
        prev.next = null;
  


}
//Merge sort on linked list
public Node midpp (Node Head){
    Node slow = Head ;
    Node fast = Head.next;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
}
public Node merge(Node head1,Node head2){
    Node mergedll = new Node(-1);
     Node temp = mergedll;

     while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
     }
     while(head1 != null){
        temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
     }
     while(head2 != null){
        temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
     }
     return mergedll.next;
}
public Node mergesort(Node head){
if(head == null || head.next == null){
    return head;
}
    //mid
    Node mid = midpp(head);
//sort left or right
Node right = mid.next;
mid.next = null;
Node leftsort = mergesort(head);
Node rightsort = mergesort(right);
//merge
return merge(leftsort,rightsort);
}

//Zig - Zag LinkedList
public void zigzag(){
    //Mid 
    Node mid = midpp(Head);
    //Reverse
     Node curr =mid.next;
     mid.next = null;
     Node prev = null;
     Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;
    }
    Node righthead = prev;
    Node lefthead = Head;
     Node ln;
     Node rn; 
    while( lefthead != null && righthead != null){
         ln = lefthead.next;
         lefthead.next = righthead;
         rn = righthead.next;
         righthead.next = ln;

        lefthead = ln;
        righthead = rn;
    }

}


    public static void main(String[] args) {
    //     Linkedlist ll = new Linkedlist();
    //     ll.addfirst(2);
    //     ll.addfirst(1);
    //     ll.addlast(1);
    //   //  ll.add(2, 3);
    //     //ll.print();       
    //     //ll.removefirst();
    //     //ll.print();
    //     //ll.removelast();
    //     //ll.print();
    //     //System.out.println(ll.search(10));
    //     //System.out.println(ll.helper(Head, 10));
    //     //ll.print(); 
    //     //ll.deletemthfromend(3);
    //     //ll.print();
    //       //ll.reverse();
    //       ll.print();    
    //      System.out.println(ll.checkPaildrome()) ; 

    // Head = new Node(1);
    // Node temp = new Node(2);
    // Head.next = temp;
    // Head.next.next = new Node(3);
    // Head.next.next.next = temp;
    // System.out.println(iscyclic());
    
    // removecyclic();
    // System.out.println(iscyclic());
    Linkedlist ll = new Linkedlist();
    
    ll.addfirst(6);
    ll.addfirst(5);
    ll.addfirst(4);
    ll.addfirst(3);
    ll.addfirst(2);
    ll.addfirst(1);  
    ll.print();
    ll.zigzag();
    ll.print();

 }
}