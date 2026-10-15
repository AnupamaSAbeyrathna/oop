import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    private static final int SIZE = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[SIZE]; // mandatory to tell the size of the array
        int sum = 0;

        System.out.println("Please enter " + SIZE + " numbers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        Arrays.sort(nums); // sorts in ascending order

        System.out.println("Sum of the " + SIZE + " numbers: " + sum);
        System.out.println("Sorted numbers (ascending): " + Arrays.toString(nums));

        scanner.close();

        List<Integer> list = new ArrayList<>();
        
        PlayWithList(list);

    }

    public static void PlayWithList(List<Integer> List){}
        for (int i : list) {
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
}