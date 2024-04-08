import java.util.Scanner;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilderResult = new StringBuilder();
        for (int i = 0; i < numConcatenations; i++)
        {
            stringBuilderResult.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long durationStringBuilder = (endTimeStringBuilder - startTimeStringBuilder);
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBufferResult = new StringBuffer();
        for (int i = 0; i < numConcatenations; i++)
        {
            stringBufferResult.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationStringBuffer = (endTimeStringBuffer - startTimeStringBuffer);
        System.out.println("StringBuilder time taken: " + durationStringBuilder + " milliseconds ");
        System.out.println("StringBuffer time taken: " + durationStringBuffer + " milliseconds ");
        System.out.println("Final length of StringBuilder result: " + stringBuilderResult.length());
        System.out.println("Final length of StringBuffer result: " + stringBufferResult.length());
    }
}
