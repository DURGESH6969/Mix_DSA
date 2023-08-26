
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ratio_of {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>0) count1++;
            if(arr.get(i)<0) count2++;
            if(arr.get(i)==0) count3++;
        }

        double x= (double)count1/arr.size();
        double y= (double)count2/arr.size();
        double z= (double)count3/arr.size();
        System.out.printf("%.6f%n",x);
        System.out.printf("%.6f%n",y);
        System.out.printf("%.6f%n",z);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            num.add(i, sc.nextInt());
        }
        plusMinus(num);
    }
}
