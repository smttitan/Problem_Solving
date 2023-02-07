import java.util.*;
public class library_fine{
	public static void main(String[] args) {
		 Scanner inp=new Scanner(System.in);
		System.out.println("Enter the returned day(date month year):");
       int d1=inp.nextInt();
       int m1=inp.nextInt();
       int y1=inp.nextInt();
		System.out.println("Enter the due day(date month year):");
       int d2=inp.nextInt();
       int m2=inp.nextInt();
       int y2=inp.nextInt();
       if(y1==y2){
           if(m1==m2){
               if(d1<=d2){
                   System.out.println("Fine:"+0);
               }
               else if(d1>d2){
            
                   System.out.println("Fine:"+15*(d1-d2));
               }
               
           }
           else if(m1>m2){
              
               System.out.println("Fine:"+500*(m1-m2));
           }
           else if(m1<m2){
               System.out.println("Fine:"+0);
           }
       }
       else if(y1>y2){
           System.out.println("Fine:"+10000);
       }
       else if(y1<y2){
           System.out.println("Fine:"+0);
       }
	}
}