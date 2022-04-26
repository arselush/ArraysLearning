import java.util.Arrays;

public class ArraysDefaultValuesDemo {
    public static void main(String[] args) {
        String[] stringArray = new String[4];
        int[] integerArray = new int[4];
        double [] dA = new double[4];
        char[] characterArray = new char[4];
        boolean[] booleanArray = new boolean[4];

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(dA));
        System.out.println(Arrays.toString(characterArray));
        System.out.println(Arrays.toString(booleanArray));

    }
}
