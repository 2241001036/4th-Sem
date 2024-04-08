public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            if (str == null) {
                throw new CustomNullPointerException("Custom NullPointerException: String is null");
            }
            int length = str.length();
            System.out.println("Length of the string is: " + length);
        } catch (CustomNullPointerException e) {
            System.out.println("Caught CustomNullPointerException: " + e.getMessage());
        }
    }
}
