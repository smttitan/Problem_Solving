import java.util.*;
public class alternative_element_of_array{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        for(int i=0;i<n;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}