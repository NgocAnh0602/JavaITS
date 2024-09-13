import java.util.Scanner;

public class bai2_task1 {
    public static void main(String[] args) {
        double kq;
        System.out.print("Nhập giá trị nhiệt độ: ");
        double giaTri = new Scanner(System.in).nextDouble();
        System.out.print("Nhập đơn vị cần chuyển đổi: ");
        String donVi = new Scanner(System.in).nextLine();
        // so sánh chuỗi dùng equals
        if ("F".equals(donVi)) {
            kq = giaTri * 9 / 5 + 32;
            System.out.println(kq);
        } else if ("C".equals(donVi)) {
            kq = (giaTri - 32) * 5 / 9;
            System.out.println(kq);
        } else {
            System.out.print("Không phải đơn vị cần chuyển đổi");
        }
    }
}
