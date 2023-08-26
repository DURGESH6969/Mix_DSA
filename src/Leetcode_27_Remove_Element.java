import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Leetcode_27_Remove_Element {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(23);
        num.add(232);
        num.add(12);
        num.add(23);
        num.add(4);

        int ogSize = num.size();

        int count = 0 ;

        for(int val:num)
        {
            if(val==23)
                count++;
        }
        System.out.println(count);

        int key=23;

        num.removeAll(Collections.singletonList(key));

        ArrayList<String> formattedList = new ArrayList<>();
        for (int n : num) {
            formattedList.add(String.valueOf(n));
        }
        // Add dashes for the removed elements
        int numDashes = ogSize-num.size();
        for (int i = 0; i < numDashes; i++) {
            formattedList.add("_");
        }

        // Print the formatted ArrayList
        System.out.println(formattedList);


        }

    }

