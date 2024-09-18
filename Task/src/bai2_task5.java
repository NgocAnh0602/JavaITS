import java.util.Scanner;

public class bai2_task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập một số: ");
                int n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Không phải số nguyên.");
                sc.next();
            }
        }
    }
}
