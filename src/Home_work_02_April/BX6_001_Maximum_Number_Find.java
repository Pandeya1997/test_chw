package Home_work_02_April;

public class BX6_001_Maximum_Number_Find {
    public static void main(String[] args) {
        int [] arr = {3000,50,60,90,10, 100,999};
        int max = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" Find the maximum Values in Array " +  max) ;
    }

}
