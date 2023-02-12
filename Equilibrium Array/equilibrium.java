import java.util.* ;
public class equilibrium{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter no.of.element:");
        int n=inp.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int m=(0+n-1)/2;int lef=0,rig=0;
        for(int i=0;i<n;i++){
            if(i<m){
                lef+=arr[i];
            }
            else if(i>m){
                rig+=arr[i];
            }
        }
        if(lef==rig){
            System.out.println("Equilibrium Position:"+m+1);
        }
        else if(n==1){
            System.out.println("Equilibrium Position:"+1);
        }
        else{
            System.out.println("No Equilibrium  exists");
        }
    }
}