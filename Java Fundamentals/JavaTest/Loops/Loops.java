import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("World");
        dynamicArray.add("etc");
        for(int i=0; i<dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));

            String name = dynamicArray.get(i);
            System.out.println(name + "hello");
        }

        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        for(int i=0; i<snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
            }
        }
        System.out.println(snacks);
    }
}