import java.util.*;
/*Given an array of size N and you have to tell whether the array is perfect or not.
 An array is said to be perfect if it's reverse array matches the original array.
 If the array is perfect then print "PERFECT" else print "NOT PERFECT".*/
public class perfect_array {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();String out="";
        int[] arr1=new int[n];
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=inp.nextInt();
        }
        for(int i=arr1.length-1;i>=0;i--){
            arr[(n-1)-i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            if(arr1[i]==arr[i]){
                out="perfect";
            }
            else{
                out="not perfect";
                break;
            }
        }
        System.out.println(out);
    }
}
