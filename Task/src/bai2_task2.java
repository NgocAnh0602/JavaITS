import java.util.Scanner;

public class bai2_task2 {
    public static void main(String[] args) {
        boolean check = true;
        System.out.print("Nhập số: ");
        int n = new Scanner(System.in).nextInt();
        if (n<2) {
            check = false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(n+" là số nguyên tố");
        } else {
            System.out.println(n+" không là số nguyên tố");
        }
    }
}
