import java.util.HashMap;
import java.util.Set;
public class HashmatiqueTest {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

    trackList.put("The Banana Boat Song", "Dayo dayo");

    trackList.put("Bad Guy", "White shirt now red");

    trackList.put("Royals", "I've never seen a diamond in the flesh");

    trackList.put("PAPAYA", "Pa Pa PAPAYA, Pa Pa PAPAYA");

    String paPaYa = trackList.get("PAPAYA");
    System.out.println(paPaYa);

    Set<String> keys = trackList.keySet();
    for(String key : keys) {
        System.out.println(key + ": " + trackList.get(key));
    }

    }

    
}