import java.util.HashMap;

public class Song {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Echoes of the Sea", "Drifting waves, calling me home...");
        trackList.put("Midnight Mirage", "Lost in the shadows of neon dreams...");
        trackList.put("Skybound Symphony", "Soaring higher, touching the light...");
        trackList.put("Gravity's Lullaby", "Pulling me in, lost in time...");

        String selectedSong = "Midnight Mirage";
        System.out.println("Lyrics for '" + selectedSong + "': " + trackList.get(selectedSong));

        System.out.println("\nComplete Track List:");
        for (String track : trackList.keySet()) {
            System.out.println("Track: " + track + " - Lyrics: " + trackList.get(track));
        }
    }
}
