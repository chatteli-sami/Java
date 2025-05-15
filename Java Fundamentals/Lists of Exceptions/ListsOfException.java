import java.util.ArrayList;

public class ListsOfException {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("goodby World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Index " + i + " successfully casted to Integer: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("Error occurred at index " + i + ": " + myList.get(i));
                System.out.println("Error message: " + e.getMessage());
            }
        }
    }
}