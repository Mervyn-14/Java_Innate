import java.util.Scanner;

public class passgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Mervyn";
        for(int i=1;i<=4;i++) {
            String b = sc.nextLine();
            if(a.equals(b)) {
                System.out.println("pass crct");
                break;
            }
            else if(i<3 && a!=b ) {
                System.out.println("Try again");
            }
            else {
                 System.out.println("Sorry");
            }
            }
        }
    } 