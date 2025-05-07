import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello Java");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        System.out.println(things);

        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();

        int[] order = {2, 1, 5, 3, 4, 0};

        for (int i :order){
            phrase.add(words[i]);
        } 
        System.out.println(phrase);
    }
}