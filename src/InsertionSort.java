import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}
