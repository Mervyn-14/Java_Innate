import java.util.*;
public class gr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int b=0;
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
            b+=arr[i];
        }
        int c = b/5;
        if(c>=90) {
            System.out.println("A+");
        }
        else if(c>=80 && c<90) {
            System.out.println("A");
        }
        else if(c>=70 && c<89) {
            System.out.println("A");
        }
        else if(c>=60 && c<70) {
            System.out.println("A");
        }
        else {
            System.out.println("FAil");
        }
        
    }
}           