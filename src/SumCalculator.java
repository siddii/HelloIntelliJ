/**
 * Created by e049807 on 6/13/15.
 */
public class SumCalculator {

    public static void main(String[] myArgs) {
        int sum = 1;
        for (int i = 0; i < myArgs.length; i++) {
            sum += Integer.parseInt(myArgs[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
