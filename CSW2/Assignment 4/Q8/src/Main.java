public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (AnagramChecker.areAnagrams(str1, str2)) {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}
