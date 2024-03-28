import java.util.HashMap;
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charFrequencyMap.containsKey(c) || charFrequencyMap.get(c) == 0) {
                return false;
            }
            charFrequencyMap.put(c, charFrequencyMap.get(c) - 1);
        }
        return true;
    }
}
