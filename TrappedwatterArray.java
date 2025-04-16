public class TrappedwatterArray {
  public static void main(String[] args) {
  // left max array
  // right max array
  // in dono ka minimum
  // put in formula water level(min of array in right and left) - height of bloc
   
  int height [] =  {4,2,0,3,2,5};
  //leftmax
  int leftmax[] = new int [height.length];
  leftmax[0] = height[0]; 
  for(int i = 1; i<height.length;i++){
    leftmax[i] = Math.max(height[i], leftmax[i-1]);
  }
  //Rightmax
  int rightmax[]= new int[height.length];
  rightmax[height.length-1] = height[height.length-1];
  for(int i =height.length-2; i>=0;i--){
    rightmax[i] = Math.max(height[i], rightmax[i+1]);
  }
  
  int trappedwater = 0;


  for(int i = 0; i<height.length;i++){
    // mwaterlevel (dona ka minimum)
    int waterlevel = Math.min(leftmax[i], rightmax[i]);
    trappedwater = trappedwater + (waterlevel - height[i]);
  }
System.out.println(trappedwater);
}

    
}
