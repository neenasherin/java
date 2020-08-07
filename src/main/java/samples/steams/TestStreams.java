import java.util.Arrays;

//package samples.steams;

public class TestStreams {
    public static void main(String[] args) {

        int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = 0;
        for (int j : i) {
            sum += j;
        }

        System.out.println(sum);

        System.out.println(Arrays.stream(i).reduce(0, (total, n) -> total += n));
    }
}