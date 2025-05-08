import java.util.HashMap;
import java.util.Set;

public class HashmapFun {
    public static void main(String[] args) {
        // Creating a HashMap to store country names and their capitals
        HashMap<String, String> countryCapitals = new HashMap<>();

        // Adding five countries and their capitals
        countryCapitals.put("Oman", "Muscat");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Brazil", "Brasília");

        // Printing all keys (country names)
        Set<String> countries = countryCapitals.keySet();
        System.out.println("Countries in the map: " + countries);

        // Printing two countries with their capitals
        System.out.println("The capital of Oman is " + countryCapitals.get("Oman") + ".");
        System.out.println("The capital of Japan is " + countryCapitals.get("Japan") + ".");
        System.out.println("The capital of Brazil is " + countryCapitals.get("Brazil") + ".");
    }
}
