package Home_work_04_May;

public class element_exists_in_a_2D_array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int count = 0;
        //boolean elements  == 8;
        for(int i = 0; i<arr.length; i++){
         //  System.out.print("i -->" +i);
            for (int j= 0; j<=i; j++ ){
              //  System.out.print(j);
                count =count + i;

            }
        }
        if (count == 8) {
            System.out.println("element =8"+ true);
        }
     // count = + count ;
       // System.out.println(count);
    }
}
/*
int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
 */