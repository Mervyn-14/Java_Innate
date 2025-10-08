import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long start = System.currentTimeMillis();
        int a = sc.nextInt();
        int sum =0;
        for(int i=1;i<=a;i++) {
            if(a%i==0) {
                sum++;
            }
    }
    if(sum==2) {
        System.out.println("Prime num");
    }
    else {
        System.out.println("not prime");
    }
    long end = System.currentTimeMillis();
    System.out.println(end-start);
}
}
