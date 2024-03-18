public class Main
{
    public static void main(String[] args)
    {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        String key = pair.getKey();
        Integer value = pair.getValue();
        System.out.println("Key: " + key + ", Value: " + value);
        System.out.println("Pair: " + pair);
    }
}

