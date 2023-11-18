import java.util.Arrays;
import java.util.Collections;

public class p110 {
    public static void main(String[] args) {
        Integer[] numbers = { 5, 1, 7, 8, 9, 3 };

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array sorted in descending order:" + Arrays.toString(numbers));
    }

}
