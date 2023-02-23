import java.util.*;

public class swap_kth_element {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int k = inp.nextInt();
        int temp = 0;
        temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
