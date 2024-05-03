public class BX6_CHW_0002 {
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
