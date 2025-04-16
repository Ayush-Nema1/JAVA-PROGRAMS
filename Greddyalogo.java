





public class Greddyalogo {
    //Activity Selection
    public static void main(String[] args) {
    //Activity Selection for sorted end 
    /*
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int lastend = end[0];
        int max = 1;
        ArrayList<Integer> list = new ArrayList<>();        
        list.add(0);
        for(int i = 1;i < end.length;i++){
        if(start[i] >= lastend){
            max++;
            list.add(i);
        } 
        lastend = end[i];
        
        }
        System.out.println(max);
        for(int i = 0 ;i<list.size();i++){
        System.out.print("A"+i +" ");
     */
    //Activity Selection for unsorted end
    /*    
    int start[] = {1,3,0,5,8,5};
    int end[] = {2,4,6,7,9,9};    
    int act[][] = new int [start.length][3];
    for(int i = 0;i<start.length;i++){
        act[i][0] = i;
        act[i][1] = start[i];
        act[i][2] = end[i];
    }     
    Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));
    ArrayList<Integer> list = new ArrayList<>();
    int max = 0;
    max = 1;        
    int lastend = act[0][2];
    list.add(0);
    for(int i = 1;i<end.length;i++){
        if(act[i][1] >= lastend){
            max++;
            list.add(i);
            lastend = act[i][2];
        }
       
    }
    System.out.println(max);
 for(int i = 0;i<list.size();i++){
    System.out.print("A" + list.get(i) + " ");
 }
}
 */
    //Fractional knapscak
    /* 
    int value[] = {60,100,120};
    int weight[] = {10,20,30};
    double ratio[][] = new double[value.length][2];
    for(int i = 0;i<value.length;i++){
        ratio[i][0] = i;
        ratio[i][1] =(value[i]/ (double)weight[i]);
    }
    Arrays.sort(ratio,Comparator.comparing(o -> o[1]));
    int capcity = 50;
    double totalval = 0;
    for(int i = value.length-1;i>=0;i--){
        int idx = (int)ratio[i][0];
        if(capcity > weight[idx]){
           capcity = capcity - weight[idx];
           totalval = totalval + value[idx];
        }
        else{
            totalval = totalval+ (ratio[i][1] * capcity);
            capcity = 0;
            break;
        }
    }
    System.out.println(totalval);
    */
 //   Minimum Absoulte pairs of array
 /* 
 int A[] = {4,1,8,7};
 int B[] = {2,3,6,5};
 Arrays.sort(A);
 Arrays.sort(B);
 int maxdiff = 0;
 for(int i = 0;i<A.length;i++){
    maxdiff = maxdiff + Math.abs(A[i]-B[i]);
 }
 System.out.println(maxdiff);
 */
//Maximum length chain of pairs
/* 
int chain[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
Arrays.sort(chain ,Comparator.comparingDouble(o -> o[1]));
int ans =0;
ArrayList<Integer> list = new ArrayList<>();
int lastend = chain[0][1];
ans++;
list.add(chain[0][0]);
list.add(chain[0][1]);
for(int i = 1;i<chain.length;i++){
    if(chain[i][0] > lastend){
        ans++;
        lastend = chain[i][1];
        list.add(chain[i][0]);
        list.add(chain[i][1]);
    }
}
System.out.println(ans);
for(int i = 0;i<list.size()-1;i++){
    System.out.print("["+ list.get(i)+","+ list.get(i+1) + "]" + "->");
}
*/
//Indian coins
/* 
Integer coins[] = {1,2,5,10,20,50,100,500,1000,2000};
Arrays.sort(coins,Comparator.reverseOrder());
int p = 5590;
int note = 0;
ArrayList<Integer>list = new ArrayList<>();
for(int i =0;i<coins.length;i++){
    if(p >= coins[i]){
        while(p >= coins[i]){
            p = p - coins[i];
            note++;
            list.add(coins[i]);
        }
    }
}
for(int i = 0;i<list.size();i++){
System.out.print(list.get(i) + " ");
}
*/
//Job sequence max profit
/* 
int jobs[][] ={{4,20},{1,10},{1,40},{1,30}};
int time = 0;
Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));
int profit = 0;
for(int i =jobs.length-1;i>=0;i--){
    if(time < jobs[i][0]){
        time++;
        profit += jobs[i][1];
    }
}
System.out.println(profit);
*/
//chocola problem
/* 
int n = 4, m= 6;
Integer costv[] = {2,1,3,1,4};
Integer costh[] = {4,1,2};

Arrays.sort(costv , Comparator.reverseOrder());
Arrays.sort(costh,Comparator.reverseOrder());

int h = 0 , v =0;
int hp = 1 , vp =1;
int cost = 0;
while(h < costh.length && v < costv.length){
    if(costh[h] >= costv[v]){
      cost += (costh[h] * vp);
      h++;
      hp++;
    }else{
        cost += (costv[v]  * hp);
        v++;
        vp++;
    }
}
while(h < costh.length){
    cost += (costh[h] * vp);
    h++;
    hp++;
}
while(v < costv.length){
    cost += (costv[v]  * hp);
        v++;
        vp++;
}
System.out.println(cost);
 */
//Maximum Balanced String Partitions
/* 
String s = "RRLLRLLRLLRR";
int i =0;
int b = 0;
int l = 0;

while(i<s.length()){
    char curr = s.charAt(i);
    if(curr == 'L' ){
        l--;
        
    }else{
        l++;
     
    }
    if(l == 0){
        b++;
        l =0;
    }
    i++;
    
}
System.out.println(b);
*/
//Kth largest odd number in a given range
int k =-1;
for(int i = -3;i<=20;i++){
    if(i % 2 != 0 && i > 0){
         k++;
   if(k == 3){
   System.out.println(i);
   }
    }
}
} 
}

