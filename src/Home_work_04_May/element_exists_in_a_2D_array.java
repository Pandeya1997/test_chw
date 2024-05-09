package Home_work_04_May;

import java.util.Arrays;

public class element_exists_in_a_2D_array {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 5},
                {4, 5, 6,5},
                {7, 8, 9,2}
        };
        int count = 0;
        //System.out.println(arr.length);
        //boolean elements  == 8;
        for(int i = 0; i<arr.length; i++){
         //  System.out.print("i -->" +i);
            for (int j= 0; j<arr[i].length; j++ ){
             //   System.out.println(arr[i].length);
              //  System.out.print(j);
                count =count + i;
                arr[i][0] = 17;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        //[[1, 2, 3, 5], [4, 5, 6, 5], [17, 8, 9, 2]]
        //[[17, 2, 3, 5], [17, 5, 6, 5], [17, 8, 9, 2]]
     // count = + count ;
     //   System.out.println(count);
        if (count == 8) {
            System.out.println("element ="+ count + true );
        } else
        {
            System.out.println("element ="+ count +false);
        };
    }
}
/*
int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
 */