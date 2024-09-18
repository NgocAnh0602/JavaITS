import java.util.HashMap;
import java.util.Scanner;

public class bai2_task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> qlKhachHang = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        // Thêm khách hàng vào danh sách
        qlKhachHang.put(1,"Ánh");
        qlKhachHang.put(2,"Xuân");
        qlKhachHang.put(3,"Yến");

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Tìm kiếm khách hàng");
            System.out.println("2. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã khách hàng cần tìm: ");
                    String searchMa = sc.nextLine();
                    if (qlKhachHang.containsKey(searchMa)) {
                        System.out.println("Thông tin khách hàng; " + qlKhachHang.get(searchMa));
                    } else {
                        System.out.println("Không tìm thấy khách hàng c mã này.");
                    }
                    break;
                case 2:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return; // thoát khỏi vòng lặp và kết thúc chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
