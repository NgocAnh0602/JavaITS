import java.util.ArrayList;
import java.util.Scanner;

public class bai1_task4 {
    public static void main(String[] args) {
        ArrayList<String> qlThuVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    // Thêm sách
                    System.out.print("Nhập tên sách: ");
                    String title = sc.nextLine();
                    qlThuVien.add(title); // thêm sách vào danh sách
                    System.out.println("Sách đã được thêm.");
                    break;
                case 2:
                    // Sửa thông tin sách
                    System.out.print("Nhập tên sách cần sửa: ");
                    String oldTitle = sc.nextLine();
                    if (qlThuVien.contains(oldTitle)) { // Kiểm tra xem sách có trong danh sách không
                        System.out.print("Nhập tên sách mới: ");
                        String newTitle = sc.nextLine();
                        qlThuVien.set(qlThuVien.indexOf(oldTitle), newTitle);
                        System.out.println("Sách đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy sách có tên này.");
                    }
                    break;
                case 3:
                    // Xóa sách
                    System.out.print("Nhập tên sách cần xóa: ");
                    String deleteTitle = sc.nextLine();
                    if (qlThuVien.remove(deleteTitle)) {
                        System.out.println("Sách đã được xóa.");
                    } else {
                        System.out.println("Không tìm thấy sách có tên này.");
                    }
                    break;
                case 4:
                    // Tìm kiếm sách
                    System.out.print("Nhập tên sách cần tìm: ");
                    String searchTitle = sc.nextLine();
                    if (qlThuVien.contains(searchTitle)) {
                        System.out.println("Sách có trong thư viện: " + searchTitle);
                    } else {
                        System.out.println("Không tìm thấy sách.");
                    }
                    break;
                case 5:
                    // Hiển thị danh sách sách
                    if (qlThuVien.isEmpty()) {
                        System.out.println("Thư viện hiện không có sách.");
                    } else {
                        System.out.println("Danh sách sách trong thư viện:");
                        for (int i = 0; i < qlThuVien.size(); i++) {
                            System.out.println((i + 1) + ". " + qlThuVien.get(i)); // In ra chỉ số và tên sách
                        }
                    }
                    break;
                case 6:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return; // Thoát vòng lặp và kết thúc chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
