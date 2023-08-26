import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swapping(a,i,j);
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    private static void swapping(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
