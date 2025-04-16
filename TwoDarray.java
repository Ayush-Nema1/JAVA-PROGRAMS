
public class TwoDarray {
/* 
    public static int find(int matrix[][]){
    
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    
 for(int i = 0; i<matrix.length;i++){
    for(int j = 0;j<matrix[0].length;j++){
         largest = Math.max(largest, matrix[i][j]);
         smallest = Math.min(smallest, matrix[i][j]);

    } }
    System.out.println(smallest);

    return largest;

}
 */   
//Spiral matrix
/* 
public static void spiralm(int spiral[][]){
    int startingrow =0;
    int endingrow = spiral.length-1;
    int startingcol = 0;
    int endingcol = spiral[0].length-1;
    
    while(startingrow <= endingrow && startingcol <= endingcol){
    
        // top 
        for(int j = startingcol; j<=endingcol;j++){
            System.out.print(spiral[startingrow][j]);
        }
        //Right1
        for(int i = startingrow+1;i<endingrow;i++){
            System.out.print(spiral[i][endingcol]);
        }
     
        //Bottom
        for(int j = endingcol-1; j>= startingcol;j--){
            System.out.print(spiral[endingrow][j]);
        }
        //left
        for(int i = endingrow-1; i >= startingrow+1;i--){
            System.out.print(spiral[i][startingcol]);
        }
 
     startingrow++;
     startingcol++;
     endingcol--;
     endingrow--;    
     
    }

}
*/    
//Diangoal sum
/* 
public static void digonalsum(int Diangoal[][]){
      // sum 
      int sum = 0;
      for(int i =0;i< Diangoal.length;i++){
    //primary 
        sum +=  Diangoal[i][i]; 
      //secondary
    if(i != Diangoal.length-1-i){
      sum += Diangoal[i][Diangoal.length-1-i]; 
    }}
    System.out.println(sum);;
}
*/
//Search in 2d sorted array
/* 
public static boolean Search(int matrix[][] ,int key){
int row = matrix.length-1, col = 0;
while(row >=0 && col < matrix[0].length){
    if(matrix[row][col] == key){
       System.out.println("key found at (" + row + "," + col + ")" );
        return true;
    }
    else if(matrix[row][col] > key){
        row--;
    }
    else{
        col++;
    }
}

System.out.println("key not found");
return false;

}
*/

public static void main(String[] args) {
//Input 2d aaray
/*   
        int matrix [] [] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("give numbers");
        for(int i =0;i<n; i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
        int result = find(matrix);
        System.out.println(result);
    }
*/
//Diagonal sum
/*  
int Diangonal[][] ={{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}};
   digonalsum(Diangonal);
*/
//Search in sorted array
/* 
int matrix[][] = {{10,20,30,40},
                  {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
int key = 39;
                Search(matrix, key);

*/
// int nums [] = {-1, 0,  1, 2, -1, -4};
// for(int i = 0 ; i<nums.length;i++){
//     for(int j = i+1;j<nums.length;j++){
//         for(int k= j+1;k<nums.length;k++ ){
//             if(nums[i]+nums[j]+nums[k] == 0){
//                System.out.println("(" + i + "," + j + ","+ k + ")");
//             }
int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int row = 0;
    int endingrow = matrix.length-1;
    int col = 0;
    int endingcol = matrix[0].length-1;
    while(row <matrix.length && col < matrix[0].length ){
        //first row 
        for(int i = col;i<=endingcol; i++){
            System.out.print( matrix[row][i] + " ");            
        }
        //left
        for(int i= row+1;i<=endingrow;i++){
          System.out.print(  matrix[i][endingcol] + "");
        }
        //bottom
       if(row <= endingrow){
        for(int i = endingcol-1; i>=col;i--){
           System.out.print(matrix[endingrow][i] + " ");
            
        }
    }
        //right
        if(col <= endingcol){
        for(int i =endingrow-1;i>row+1 ;i-- ){
       System.out.print(matrix[i][col] + " ");
        }
        }
        row++;
        col++;
        endingrow--;
        endingcol--;
        
        
               }
        
    }
}

