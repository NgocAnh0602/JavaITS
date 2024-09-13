import java.util.Scanner;

public class bai3_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,kq;
        char c;
        System.out.print("Nhập số thứ nhất: ");
        a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        b = sc.nextDouble();
        System.out.print("Nhập phép toán: ");
        // nhập kí tự char dùng next().charAt(0)
        c = sc.next().charAt(0);
        switch(c) {
            case '+':
                System.out.println("Tổng 2 số là: "+(a+b));
                break;
            case '-':
                System.out.println("Hiệu 2 số là: "+(a-b));
                break;
            case '*':
                System.out.println("Tích 2 số là: "+(a*b));
                break;
            case '/':
                System.out.println("Thương 2 số là: "+(a/b));
                break;
            default:
                System.out.println("Không phải phép toán cần tính");
        }
    }
}
