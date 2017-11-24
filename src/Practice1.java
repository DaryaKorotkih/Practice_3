import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number a"); //user enter 1 number
        int a = in.nextInt();

        System.out.println("Enter number b"); //user enter 2 number
        int b = in.nextInt();

        System.out.println("a == b = "+ (a==b));
        System.out.println("a %= b = "+(a%b));
        System.out.println("a > b = " +(a>b));


    }

}
