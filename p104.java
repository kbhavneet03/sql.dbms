import java.util.Scanner;

public class p104 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key element to search: ");
        int key = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                System.out.println("Key element " + key + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Key element " + key + " not found in the array.");
        }
    }
}
