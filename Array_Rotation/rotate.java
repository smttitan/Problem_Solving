import java.util.*;
public class rotate{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("No.of.element in array:");
		int n=inp.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();
		}
		int temp1=0,temp2=0;
		for(int i=0;i<n;i++){
			
			if(i==0){
				temp1=arr[i+1];
				arr[i+1]=arr[i];
			}
			else if(i==n-1){
				arr[0]=temp2;
			}
			else if(i%2!=0){
				temp2=arr[i+1];
				arr[i+1]=temp1;
			}
			else if(i%2==0){
				temp1=arr[i+1];
				arr[i+1]=temp2;
			}
		}
		System.out.println("rotated array: ");
		for(int i=0;i<n;i++){
			
			System.out.print(arr[i]+" ");
		}

	}
}