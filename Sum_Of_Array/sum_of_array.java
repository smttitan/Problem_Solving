import java.util.*;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       System.out.println(sum);
    }
}