import java.util.*;

public class Missing_Number_In_Array {
    static int MissingNumber(int array[], int n) {
        int miss = 0;
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {

            if (array[i] != i + 1) {
                miss = i + 1;
                break;
            } else if (i == n - 2 && array[i] != i + 2 && array[i] == i + 1) {
                miss = i + 2;
                break;
            } else {
                miss = -1;
            }
        }
        return miss;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println(MissingNumber(arr, n));
    }
}
