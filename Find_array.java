import java.util.*;
public class Find_array {
  public static void main(String[] args) {
  	Scanner inp=new Scanner(System.in);
    int out=0;
    System.out.println("Enter no.of.element:");
    int n=inp.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++){
    	arr[i]=inp.nextInt();
    }
    System.out.println("Enter element to search:");
    int e=inp.nextInt();
    for(int i=0;i<n;i++){
    	if(arr[i]!=e){
        	out=-1;
          }
        else if(arr[i]==e){
        	out=i;
            break;
        }
    }
    if(out==-1){
        System.out.println(e+" is not found");
    }
    else{
        System.out.println(e+" found at"+out);
    }
    
  }
}
