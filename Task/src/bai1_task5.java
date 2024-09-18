import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bai1_task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm thông tin sách");
            System.out.println("2. Thoát");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    // Nhập thông tin sách
                    System.out.print("Nhập tên sách: ");
                    String tenSach = sc.nextLine();

                    System.out.print("Nhập tên tác giả: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhập năm xuất bản: ");
                    String namXuatBan = sc.nextLine();

                    // Lưu thông tin sách vào file
                    try {
                        // Sử dụng FileWriter để ghi thông tin vào tệp "sach.txt"
                        FileWriter writer = new FileWriter("sach.txt", true); // true để thêm vào cuối tệp
                        writer.write("Tên sách: " + tenSach + ", Tác giả: " + tacGia + ", Năm xuất bản: " + namXuatBan + "\n");
                        writer.close();
                        System.out.println("Thông tin sách đã được lưu vào tệp.");
                    } catch (IOException e) {
                        System.out.println("Đã xảy ra lỗi khi ghi vào tệp.");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

