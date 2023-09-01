import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Panagram_Accenture {
    static int isPanagram(ArrayList<String> s)
    {
        HashSet<Character> ans = new HashSet<>();
        int n = s.size();
        for(int i=0;i<n;i++)
        {
            String temp = s.get(i);
            for (char ch: temp.toCharArray())
            {
                if(Character.isLowerCase(ch)){
                    ans.add(ch);
                }
            }

        }

        if (ans.size() == 26)
            return 1; // It is a pangram
        else
            return 0; // It is not a pangram

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings in the array: ");
        int numStrings = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            s.add(sc.nextLine());
        }
        System.out.println(isPanagram(s));

        }
}
