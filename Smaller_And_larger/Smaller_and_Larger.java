import java.util.Scanner;
/*Given a sorted array Arr of size N and a value X,
 find the number of array elements less than or equal to X and elements more than or equal to X. */
public class Smaller_and_Larger {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int x=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int[] ret=new int[2];
        ret[0]=0;
        ret[1]=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                ret[0]+=1;
            }
            if(arr[i]>=x){
                ret[1]+=1;
            }
        }
       for(int i=0;i<2;i++){
           System.out.print(ret[i]+" ");
       }
    }
}
