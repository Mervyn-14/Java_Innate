import java.util.Scanner;

public class primelogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long start = System.currentTimeMillis();
        boolean pr = true;
        for(int i=2;i<=Math.sqrt(a);i++) {
            if(a%i==0) {
                pr=false;
                break;
            }
        }
        System.out.println(pr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}