import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        if(a>5) {
            int c = (b/100)*15;
            System.out.println(b+c);
        }
        else if(a>=3) {
           int c = (b/10);
            System.out.println(b+c); 
        }
        else {
             int c = (b/100)*5;
            System.out.println(b+c);
        }

    }
}
