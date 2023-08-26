public class MaxElementInArray {
     static void maxele(int[] arr,int n) {

         int max = 0, index = 0;
         for (int i = 0; i < n; i++) {
             if (arr[i] > max) {
                 max = Math.max(arr[i], max);
                 index = i;
             }
         }
         System.out.println(max);
         System.out.println(index);

     }

    public static void main(String[] args) {
        int [] arr = {1,3,4,56,11,334,245,2222,43,1};
        int n=arr.length;
        maxele(arr,n);
    }
}
