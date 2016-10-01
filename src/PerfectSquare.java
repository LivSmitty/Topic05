
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by scott_000 on 10/1/2016.
 */
public class PerfectSquare {
    public static void main(String[] args) {
        //Prompt user for integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();


        //Create array for num's factors
        int[] factorArray = new int[100];
        for (int i = 1; i <= num; i++) {
            int test = 0;
            test = num / i;
            int testRounded = 0;
            testRounded = Math.round(test);
            if (test == testRounded);
                factorArray[i] = test;

            }

            System.out.println(Arrays.toString(factorArray));

        }
}
