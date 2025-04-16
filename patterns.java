public class patterns {


    // public static void Hollow_triangle(int row , int col){
    //     for(int i = 1; i<=row;i++){
    //         for(int j = 1 ; j<=col;j++){
    //             if(i ==1 || j==1 || i==row || j == col){
    //                 System.out.print("*");
    //             }
    //             else System.out.print(" ");

    //         }System.out.println();
    //     }
    // }




    //  public static void inverted_rotated_halfpramid(int row ,int col){
//     for (int i = 1; i <= row; i++) {
//         for(int j = 1; j <= col - i;j++){
//             System.out.print(" ");
//         }for(int j = 1; j<=i;j++){
//             System.out.print("*");
//         }System.out.println();
//     }
//  }



// public static void inverted_halfpramid_withnumbers(int rows , int cols){
//     for(int i = 1 ; i<=rows;i++){
//         for(int j = 1; j<=cols-i+1;j++){
//             System.out.print(j);
//         }System.out.println();
//     }
// }



// public static void floyds_triangle(int rows, int cols){
//     char ch = 'A';
//     for(int i = 1; i<=rows;i++){
//         for (int j = 1; j<=i;j++){
//             System.out.print(ch);
//             ch++;
//     }System.out.println();
// }
// }



// public static void triangle_zero_one(int rows){
//     for (int i =1;i<=rows;i++){
//          for(int j=1;j<=i;j++){
    
//              if ((i+j)%2 ==0){
//         System.out.print("1");
//     }
//     else{ System.out.print("0");
//          }
//         }
//         System.out.println();
//     }
// }


// public static void butterfly(int rows){
// for(int i = 1; i<=4;i++){
//     for (int j = 1;j<=i;j++){
//         System.out.print("*");
//     }
//     for (int j = 1;j<=(4-i)*2;j++){
//         System.out.print(" ");
//     }
//     for (int j = 1;j<=i;j++){
//         System.out.print("*");
//     }System.out.println();
// }
// for(int i = 4; i>=1;i--){
//     for (int j = 1;j<=i;j++){
//         System.out.print("*");
//     }
//     for (int j = 1;j<=(4-i)*2;j++){
//         System.out.print(" ");
//     }
//     for (int j = 1;j<=i;j++){
//         System.out.print("*");
//     }System.out.println();
// }


// public static void solid_rombus(int n){
// for (int i =1;i<=n;i++){
//     for (int j = 1; j<=n-i;j++){
//     System.out.print(" ");
//     }
//     for(int j = 1; j<=n;j++){
//         System.out.print("*");
//     }

//     System.out.println();
// }

// }



// public static void hollow_rombus(int n ){
// for(int i = 1; i<= 5;i++){
//     for (int j = 1; j<=n-i;j++){
//           System.out.print(" ");
//    }
//    for(int j = 1; j<=n;j++){
//     if(i==1||i==5||j==1|| j==5){
//          System.out.print("*");
//         }
//         else System.out.print(" ");
//         }
//      System.out.println();    
   
   
// }
// }

// public static void  diamond(int n){
//     for (int i = 1; i<=4;i++){
//         for(int j=1 ;j<=4-i; j++){
//             System.out.print(" ");
//         }
//         for (int j = 1 ; j<=(2*i-1);j++){
//             System.out.print("*");
//         }
//         System.out.println();

//     }
//      for (int i = 4; i>=1;i--){
//         for(int j=1 ;j<=4-i;j++){
//             System.out.print(" ");
//         }
//         for (int j = 1 ; j<=(2*i-1);j++){
//             System.out.print("*");
//         }
//         System.out.println();
        
// }

// }


// public static void number_pramid(int n){
//     for (int i = 1; i<=5;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for (int j = 1; j<=i;j++){
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
// }

//    1
//   121
//  12321
// 1234321
//123454321
// public static void palindromic_number_pattern(int n) {
//     for (int i = 1; i <= n; i++) {
//         // Print leading spaces
//         for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//         }
//         // Print ascending numbers
//         for (int j = 1; j <= i; j++) {
//             System.out.print(j);
//         }
//         // Print descending numbers
//         for (int j = i-1; j >= 1; j--) {
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
//public static void palindrome_patthern2(int n){
//     1
//    212
//   32123
//  4321234
// 543212345
//     for(int i = 1; i<=n;i++){
//         for(int j = 1;j<=n-i;j++){
//         System.out.print(" ");
//        }
//        //decending no.
//        for (int j = i;j>=1;j--){
//         System.out.print(j);
//        }
//        //accendind order
//        for (int j = 2;j<=i;j++){
//         System.out.print(j);
//        }
//        System.out.println();
//     }
// }

public static void hollow_diamond(int n) {
    int spaces = -1;
    for(int  i = 1; i<= (2*n)-1;i++){
      if (i<n) {
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
    } 
    else{
    for (int j = 1;j<=i-n;j++){
        System.out.print(" ");
    }
    }
    //System.out.print("*");
    if(n<=i){
        spaces= spaces + 2;
     }
     else{
        spaces-=2;
     } 
    if (i!=1 ||  i!=(2*n-1)){
    

    //in this loop is not working 
    System.out.print("*");

    for (int j = 0; j<=spaces ;j++){
        System.out.print(" ");
    }
    System.out.print("*");
    
}
else{
    System.out.print("*");
}
 
 System.out.println();
}
    }
    
     
        



     public static void main(String[] args) {
                                    // Hollow_triangle(4, 5);
                                   //  inverted_rotated_halfpramid(4,4);
                                  //   inverted_halfpramid_withnumbers(5, 5);
                                 //    floyds_triangle(5, 5);                                       
                                //     butterfly(4);
                               //      solid_rombus(5); 
                              //       hollow_rombus(5);
                             //        diamond(8);
                            //         number_pramid(5);                            
                           //          palindromic_number_pattern(5);
                          //           palindrome_patthern2(5);
                                    hollow_diamond(4);
                        }    
                    }
