import java.util.*;
public class ArrayListtt {
//Swap Element 
/* 

 public static void swap (ArrayList<Integer>list,int id1,int id2){
 int temp = list.get(id1);
 list.set(id1, (list.get(id2)));
 list.set(id2,temp);

 System.out.println(list);
 }
 */
//Brute force approach of water container 
/* 
public static int waterBr(ArrayList<Integer> height,int st,int en ){ 
int maxwater = Integer.MIN_VALUE;
  for(int i=0 ; i<=height.size()-1;i++){
  for(int j = i+1 ; j<=height.size()-1;j++){
  int minheight  = Math.min(height.get(i), height.get(j));
  int width = j - i ;
  int waterlevel =  minheight * width; 
    maxwater = Math.max(waterlevel, maxwater);
}
}
return maxwater;
}
*/
//Pair sum two pointer
/*
public static boolean  pairsumn(ArrayList<Integer>list , int target){
int sm = 0;
int lr = list.size()-1;
while(sm!=lr){
if(list.get(sm) + list.get(lr) == target){
  return true;
}
else if(list.get(sm)+list.get(lr) > target){
  lr--;
}
else {
  sm++;
}
}
return false;
}
*/
//Pair sum pivot 
/* 
public static boolean pairsum(ArrayList<Integer>list , int target){
int pivotpopint = -1;
  for(int i =0; i<list.size()-1;i++){
  if(list.get(i)>list.get(i+1)){
    pivotpopint = i;
  }
}
  int sm = pivotpopint+1;
  int lr = pivotpopint-1;
 int n = list.size();

 while(sm!=lr){
if(list.get(sm) + list.get(lr) == target){
  return true;
}
else if(list.get(sm)+list.get(lr)> target){
  lr = (n+lr-1)%n;
}
else{
  sm = (sm+1)%n;
}

  }
return false;
}
*/
//wATER CONTAINER 
/* 
public static int water(ArrayList<Integer> height,int st,int en ){
  
int maximumwater = 0;
  while(st<en){
int heightt = Math.min(height.get(st), height.get(en));
int width = en - st;
int waterv = heightt * width;
 maximumwater = Math.max(waterv, maximumwater);
if(st<en){
  st++;
}else{
  en--;
} 
  }
  return maximumwater;
}
*/
//monotonomic Increaseing or decreasing 
/* 
public static boolean monotonomic(ArrayList<Integer>list){
  int lastidx = list.size()-1;
  int stridx =  0;

  if(list.get(stridx) > list.get(lastidx)){
    for(int i = 0; i<list.size()-1;i++){
      if(list.get(i) < list.get(i+1)){
        return false;
      }
    }
  }
  else{
    for(int i = 0; i<list.size()-1;i++){
      if(list.get(i) > list.get(i+1)){
        return false;
      }
    }    
  }
  
  
  return true;
}
*/

public static void main(String[] args) {
/* 
    //  ArrayList<Integer> list = new ArrayList<>();
   // list.add(1);
   // list.add(5);
   // list.add(4);
   // list.add(9);
   // list.add(6);
    //int id1 = 1;
    //int id2 = 3;
   // System.out.println(list);
   // swap(list, id1, id2);
    //minimum and maximum 
   //  int max = Integer.MIN_VALUE;
   //  for(int i = 0 ;i<list.size();i++){
   //    max = Math.max(max, (list.get(i))); 
   //  }
   //  System.out.println("Maximum element is  :- "+max);
*/
 //Multi-dienmsional Array-List

    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer>list1 = new ArrayList<>();
    ArrayList<Integer>list2 = new ArrayList<>(); 
    ArrayList<Integer>list3 = new ArrayList<>(); 
   for(int i = 1; i<=5;i++){
      list1.add(i*1);
      list2.add(i*2);
      list3.add(i*3);
   }
   mainlist.add(list1);
   mainlist.add(list2);
   mainlist.add(list3);

 System.out.println(mainlist);
 for(int i = 0; i<mainlist.size();i++){
 ArrayList<Integer>Curr = mainlist.get(i);
 for(int j = 0 ; j<Curr.size();j++){
   System.out.print(+ Curr.get(j) + " ");
 }
 System.out.println();
 }
  
 //Water containing between lines
  /* 
    ArrayList<Integer>height = new ArrayList<>();
  height.add(1);
  height.add(8);
  height.add(6);
  height.add(2);
  height.add(5);
  height.add(4);
  height.add(8);
  height.add(3);
  height.add(7);
 System.out.println(waterBr(height, 0, height.size()-1));
*/
//Pair sum optimize break pivot point 
/* 
ArrayList<Integer>list  = new ArrayList<>();
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);
//int target = 160;
//System.out.println(pairsum(list, target));
//normal pair sum 
list.add(1);
list.add(2);
list.add(6);
list.add(8);
list.add(9);
list.add(10);
int target = 160;*/
//System.out.println(pairsumn(list, target));
//monotonomic Increaseing or Decreaseing
/* 
ArrayList<Integer>list  = new ArrayList<>();
list.add(1);
list.add(2);
list.add(6);
System.out.println(monotonomic(list));
*/
// Lonely Numbers in ArrayList
/* 

ArrayList<Integer>list = new ArrayList<>();
ArrayList<Integer> list1 = new ArrayList<>();
list.add(10);
list.add(6);
list.add(5);
list.add(8);
//outerclooop for current element 

for(int j =0;j<list.size();j++){

   int curr = list.get(j);
   int count = 0;
    boolean isboolean = true;

    //Innerloop for linear search that element come more than one or not
for(int i = 0; i<list.size() ; i++){
if(curr == list.get(i) ){
  count++;
   i++;
  }
   else if(count > 1){
  isboolean = false;
    break;
   }
  }
//X+1 or X- 1 ke liye ki list me hai ya nahi

if (list.contains(curr - 1) || list.contains(curr + 1)){
 isboolean = false;
   }

//Add kar raha hai list me 

   if (isboolean) {
    list1.add(curr);
}

count = 0;

}
System.out.println(list1);
*/
//Most Frequent Number following Key(EASY)
// ArrayList<Integer>list = new ArrayList<>();

// list.add(2);
// list.add(2);
// list.add(2);
// list.add(2);
// list.add(3);
// int key = list.get(0);
// int target = list.get(1);
// int count = 0;
// for(int i = 0 ;i<list.size()-1;i++){
//   if(list.get(i) == key && list.get(i+1) == target){
//     count++;
//   }
// }
// System.out.println("target is = "+target +" count is " + count );

}
}
