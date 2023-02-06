import java.util.*;
public class check_same_array{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("No.of.element in array:");
		int n=inp.nextInt();
		int status=1;
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Element in array1:");
		for(int i=0;i<n;i++){
			arr1[i]=inp.nextInt();
		}
		System.out.println("Element in array2:");
		for(int i=0;i<n;i++){
			arr2[i]=inp.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<n;i++){
			if(arr1[i]!=arr2[i]){
				status=0;
				break;
			}
			else{
				status=1;
			}
		}
		if(status==1){
			System.out.println("same");
		}
		else if(status==0){
			System.out.println("not same");
		}

	}
}