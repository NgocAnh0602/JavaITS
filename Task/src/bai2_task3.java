import java.util.Scanner;

public class bai2_task3 {
    public static void main(String[] args) {
        String chuoi;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        chuoi = sc.nextLine().toLowerCase();
        System.out.print("Nhập ký tự cần đếm: ");
        c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == c) {
                count++;
            }
        }
        System.out.print("Số lần xuất hiện cua ký tự "+c+" là: "+count);
    }
}
