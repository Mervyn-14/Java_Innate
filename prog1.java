import java.util.*;
public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int bill = 0;
        if(a>=0 && a<=100) {
             bill+=a*5;
             System.out.println(bill);
        }
        else if (a>=101 && a<=300) {
             bill+=a*7;
             System.out.println(bill);
        }
        else if(a>=300) {
             bill+=a*10;
             System.out.println(bill);
        }
        if(bill>2000) {
            int c = bill/10;
            bill+=c;
            System.out.println("The total bill is"+bill);
        }
        
    }
}