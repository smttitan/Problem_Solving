import java.util.Scanner;
/*Given a Integer array A[] of n elements. 
Your task is to complete the function PalinArray.
 Which will return 1 if all the elements of the Array
  are palindrome otherwise it will return 0.*/
public class palindromic_array {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int temp=0;
               for(int i=0;i<n;i++){
                   String b=String.valueOf(arr[i]);String c="";
                   for(int j=b.length()-1;j>=0;j--){
                       c+=b.charAt(j);
                   }
                   if(b.equals(c)==true){
                      temp=1; 
                   }
                   else{
                       temp=0;break;
                   }
                   
               }
               System.out.println(temp);
    }
}
