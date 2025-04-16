

public class thee{
    static class Node {
      Node[] Children = new Node[26];
     boolean A = false;
    int freq;
        public Node() {
         for(int i =0;i<26;i++){
         Children[i] = null;
         
         }
         freq = 1;
        }  
    }
    public static Node root = new Node();
//----------------------------insert---------------------------------------------------------------
    public static void insert(String word){
        Node curr = root;
        for(int level = 0;level<word.length();level++ ){
            int idx = word.charAt(level) - 'a';
            if(curr.Children[idx] == null ){
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.A = true;
    }
    //----------------------------search--------------------------------------------------------------
    public static boolean search(String word){
        Node curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.Children[idx] == null){
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.A == true;
    } 

//------------------------------------Word break------------------------------------------------------------------------
    
    public static boolean wordbreak(String key){
     if(key.length() == 0){
        return true;
     }
        for(int i = 1;i<=key.length();i++){
            if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
     }
//-----------------------------------Prefixxxx PROBLEM--------------------------------------------------
public static void pre(Node root,String ans){
if(root == null){
    System.out.println(ans);
}
if(root.freq == 1){
    System.out.println(ans);
}
for(int i = 0;i<26;i++){
    if(root.Children[i]  != null){
    pre(root.Children[i], ans+(char) (i + 'a'));
    }

}
}   

    public static void main(String[] args) {
        root.freq = -1;
        String words[] ={"dog","duck","dove","zebra"};
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        } 
        System.out.println(wordbreak("ayushnemaisbillionare"));
        
        pre(root, " ");
     
    }
}
