import java.util.*;
class HashMapp{
 static class HashMap<K,V>{
    private class Node{
        K key;
        V value;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    private int n;
    private int N;
    private LinkedList<Node> buckets[];
    @SuppressWarnings("unchecked")
    public HashMap(){
    this.n = 0;
    this.buckets = new LinkedList[4];
    this.N = buckets.length;
    for(int i = 0;i<buckets.length;i++){
        this.buckets[i] = new LinkedList<>();
    }
    }

//Hashfunction
private int Hashfunction(K key){
int hc = key.hashCode();

return Math.abs(hc)% N;
}

//search
public int searchinll(K key,int bi){
LinkedList<Node> ll = buckets[bi];
int di = 0;
for(int i = 0;i<ll.size();i++){
    Node node = ll.get(i);
    if(node.key == key){
        return di;
    }
    di++;
}
return -1;
}
//rehace
public void rehace(){
    LinkedList<Node> oldbucks[] = buckets;
    buckets = new LinkedList[N*2];
    N = N*2;
    for(int i = 0;i<buckets.length;i++){
        buckets[i] = new LinkedList<>();
    }
    for(int i = 0;i<oldbucks.length;i++){
        LinkedList<Node> ll = oldbucks[i];
        for(int k = 0;k<ll.size();k++){
            Node ode = ll.remove();
            put(ode.key, ode.value);
        }
    }
}
// Put
public void put(K key,V value){
    int bi = Hashfunction(key);
    int di = searchinll(key,bi);
      
    if(di != -1){
    Node bu = buckets[bi].get(di);
    bu.value = value;
    }else{
        buckets[bi].add(new Node(key, value));
        n++;
    } 
    int lamda = n/N;
    if(lamda > 2.0){
        rehace();
    }

}
//contaIN
public boolean contains(K key){
    int bi = Hashfunction(key);
    int di = searchinll(key, bi);
    if(di != -1){
        return true;
    }
    return false;
}
//remove
public V remove( K key){
    int bi = Hashfunction(key);
    int di = searchinll(key,bi);
      
    if(di != -1){
    Node bu = buckets[bi].remove(di);
    return bu.value;    
}
    return null;
}
//Keyset
public ArrayList<K> keyset(){
    ArrayList<K> keys = new ArrayList<>();
      
    for(int i =0;i<buckets.length;i++){
        LinkedList<Node> ll = buckets[i];
        for(Node node : ll){
         keys.add(node.key);
        }
    }
   return keys;
}
//isEmpty
public boolean isEmpty(){
    return n == 0;
}
//get
public V get(K key){
    int bi = Hashfunction(key);
    int di = searchinll(key,bi);
      
    if(di != -1){
    Node bu = buckets[bi].get(di);
          return bu.value;
    }
    return null;
}
 }
public static void main(String[] args) {
    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("AYush", 6);
    hm.put("Ah", 60);
    hm.put("Yush", 600);

    System.out.println(hm.get("Ah"));
}
}