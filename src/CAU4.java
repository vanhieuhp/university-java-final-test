import java.util.HashMap;
import java.util.Map;

public class CAU4 {

    public static void main(String[] args) {
        String input = "National Economics University";
        Map<Character, Integer> charCountMap = countCharacters(input);
        charCountMap.forEach((key, value) -> System.out.println(String.format("Ký tự '%s': xuất  hiện %d lần", key, value)));
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            c = Character.toLowerCase(c);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
