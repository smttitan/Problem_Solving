import java.util.*; 
//Given a sorted array containing only 0s and 1s, find the transition point.
public class Transition_Point{
	static int point(int[] arr,int n){
		 int temp=0;int val=0;
		for(int i=0;i<n;i++){
		    if(i==0 && arr[i]==1){
		        val=i;
		        temp=1;
		        break;
		    }
			else if(arr[i]!=arr[0]){
				val=i;
				temp=1;
				break;
			}
			
		}
		if(temp==0){
			val=-1;
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();
		}
		System.out.println(point(arr,n));

	}
}