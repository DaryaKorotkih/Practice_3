import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сторону а"); //пользователь вводит 1 сторону треугольника
        double a = in.nextDouble();

        System.out.println("Введите сторону b"); //пользователь вводит 2 сторону треугольника
        double b = in.nextDouble();

        System.out.println("Введите сторону c"); //пользователь вводит 3 сторону треугольника
        double c = in.nextDouble();

        double p = (a + b + c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника равна:"+ S);





    }
}
