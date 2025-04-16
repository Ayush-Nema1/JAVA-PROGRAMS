import java.util.ArrayList;

public class Heap {
    static class heapp{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
        arr.add(data);

        int x = arr.size()-1;
        int par = ((x - 1)/2);
        while(arr.get(x) < arr.get(par)){
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);
        x = par;
        par = (x - 1) / 2;

        }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;
        if(left < arr.size() && arr.get(left) < arr.get(i)){
            min = left;
        }
        if(right < arr.size() && arr.get(i) > arr.get(right)){
            min = right;
        }
        if(min != i){
        int temp = arr.get(i);
        //swap
         arr.set(i,arr.get(min));
         arr.set(min,temp);
         heapify(min);
        }
        }
        public int remove(){
            int data = arr.get(0);

            // swap first and last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            arr.remove(arr.size()-1);
            //heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
        }
        public static void main(String[] args) {
        heapp h = new heapp();
        h.add(1);
        h.add(20);
        h.add(3);
        h.add(10);
        h.add(4);
        h.add(19);
     if(!h.isEmpty()){
        System.out.println(h.peek());
        h.remove();
     }
        }
    }

