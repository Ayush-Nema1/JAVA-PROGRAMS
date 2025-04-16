import java.util.ArrayList;
//Implementation of stack by Arraylist
public class StacKA {

    static class stack{
    static ArrayList<Integer>list = new ArrayList<>();
    public static boolean isempty(){
        return list.size() == 0;
    }
    //push
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //seek
    public static int seek(){
        if(isempty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    }
    public static void main(String[] args) {
    stack.push(1);
    stack.push(2);
    stack.push(3);

    while(!stack.isempty()){
        System.out.println(stack.seek());
        stack.pop();
    }

    }
}
