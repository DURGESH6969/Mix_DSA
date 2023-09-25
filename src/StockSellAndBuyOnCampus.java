/*

Problem Statement
Cloud Quota is a famous share market analytics company that helps the customers to invest by predicting the stock
market on daily basis. They want to add a module that allows their customers to get to know about the stock
market performance for that day.The module should get the cost price of the stocks during the opening time and closing
price at the end of the day and display the maximum profitable stock number based on percentage for that day.
If there are multiple stocks with same profit percentage, display all.


* */

import java.util.ArrayList;
import java.util.Scanner;

public class StockSellAndBuyOnCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a1 = new double[n];// stock's opening value
        double[] a2 = new double[n];// stock's closing value

        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++)
        {
            a2[i]=sc.nextDouble();
        }
        double[] profitPercent = new double[n];

        for(int i=0;i<n;i++)
        {
            if(a2[i]>a1[i]){
                profitPercent[i]=((a2[i]-a1[i])/a1[i])*100;
            }
        }
        double max = profitPercent[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < profitPercent.length; i++) {
            if (profitPercent[i] >= max) {
                ans.add(i+1);
            }
        }
        System.out.print(ans);
    }
}
