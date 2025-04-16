public class LettterCombination {
    class Solution {
        public static void res(int i,String mp[],String digits, String res ,List<String>ans){
         if(i == digits.length()){
          ans.add(res);
          return;
         }
         char ch = digits.charAt(i);
          int nums = ch - '0';
          String st = mp[nums];
         for(int j = 0; j<st.length();j++){
             res(i+1,mp,digits,res+st.charAt(j),ans);
         }  
        }
         public List<String> letterCombinations(String digits) {
         List<String>ans = new ArrayList<>();    
         if(digits.length() == 0){
             return ans;
         }
         String[] mp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         res(0,mp,digits,"",ans);
         return ans;
     
         }
         
     }
}
