

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 2, 3, 4, 2,2,2,2};

//            System.out.println(new Gfg_Majority_element().majorityElement(arr, n));
        majorityElement(a);
    }


// } Driver Code Ends


//User function Template for Java


    static void majorityElement(int[] a) {
        // your code here

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]) + 1;
                if (count > a.length / 2) {
                    System.out.println("Majority found :- " + a[i]);
                    return;
                } else
                    map.put(a[i], count);

            } else
                map.put(a[i], 1);
        }
        System.out.println(" No Majority element");
    }

}

