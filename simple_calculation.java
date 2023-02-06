import java.util.Scanner;
public class simple_calculation {
    static void menu() {
        System.out.println("-------Simple Caluclation-------");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MULTIPY");
        System.out.println("4.DIVISION");
        System.out.println("5.EXIT");

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = 0;
        int a;
        int b;
        while (n != 5) {

            menu();
            System.out.println("ENTER YOUR CHOICE:");
            n = inp.nextInt();
            if(n!=5){
                System.out.println("ENTER NUM1:");
                a = inp.nextInt();
                System.out.println("ENTER NUM2:");
                b = inp.nextInt();
                if (n == 1) {
                    System.out.println("RESULT:");
                    System.out.println((a + b));
                }
                else if (n == 2)
                 {
                    System.out.println("RESULT:");
                    System.out.println( (a - b));
                } 
                else if (n == 3) {
                    System.out.println("RESULT:");
                    System.out.println( (a * b));
                }
                else if (n == 4) {
                    System.out.println("RESULT:");
                    System.out.println (a / b);
                }
                else 
                {
                System.out.println("wrong input");
                }
             }
           

        }

    }

}