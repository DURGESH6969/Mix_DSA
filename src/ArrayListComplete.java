import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class ArrayListComplete{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Rishu");
        friends.add("Deven");
        friends.add("Ayush");
        friends.add("Sayantan");
        System.out.println(friends); //prints the whole arraylist in this manner output:[Rishu, Deven, Ayush, Sayantan]

        System.out.println(friends.get(0)); //It gives the output at the given index output: Rishu

        friends.set(0,"Alex");    //To modify an element, use the set() method and refer to the index number
        System.out.println(friends); //output:  [Alex, Deven, Ayush, Sayantan]

        System.out.println(friends.size()); // size() methods gives the size of the arraylist. output: 4

        for (String friendMember:friends) { // looping through arraylist
            System.out.println(friendMember); //  prints the friend members in separate line
        }

        System.out.println();

        System.out.println("Enter an initial Number arraylist size: \n");
        int N = sc.nextInt();

        try {
            ArrayList<Integer> num = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                num.add(i, sc.nextInt());
            }

            ListIterator<Integer> iterator = num.listIterator();

            while(iterator.hasNext())
            {
                System.out.println("value at index "+iterator.nextIndex()+ " is : " + iterator.next());
            }
        }
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}