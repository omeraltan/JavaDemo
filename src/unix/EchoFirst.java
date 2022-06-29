package unix;

import java.util.Arrays;

public class EchoFirst {
    public static void main(String[] args) {
        String one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one);
        System.out.println(result);

        boolean[][] bools[], moreBools;
    }
}
