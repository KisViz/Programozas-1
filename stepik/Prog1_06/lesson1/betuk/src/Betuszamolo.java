import java.util.HashMap;
import java.util.Map;

public class Betuszamolo {
    public static Map<Character, Integer> szamolas(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) +1);
        }



        return map;
    }
}