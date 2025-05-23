import java.util.ArrayList;
import java.util.Collections;
public class Museum {
    public static void main(String[] args) {
        // Create Paintings
        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "A swirling night sky over a quiet town", "Oil");
        Painting painting2 = new Painting("The Persistence of Memory", "Salvador Dalí", "Melting clocks in a desert landscape", "Oil");
        Painting painting3 = new Painting("Water Lilies", "Claude Monet", "Beautiful lilies floating on a pond", "Watercolor");

        // Create sculptures
        Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "A Renaissance masterpiece of the human form", "Marble");
        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "A man deep in thought", "Bronze");

        ArrayList<Art> museum = new ArrayList<>();
        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);

        Collections.shuffle(museum);
        for (Art art : museum) {
            art.viewArt();
        }
    }
}
