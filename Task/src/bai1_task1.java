import java.util.Scanner;

public class bai1_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // khởi tạo đối tuượng scanner
        double canNang, chieuCao, chiSoBMI;
        String kq;
        System.out.print("Nhập cân nặng: ");
        canNang = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        chieuCao = sc.nextDouble();
        chiSoBMI = canNang / (chieuCao * chieuCao);
        System.out.format("Chỉ số BMI: %.1f\n",chiSoBMI);
        if (chiSoBMI < 18) {
            kq = "Gầy";
        } else if (chiSoBMI < 25) {
            kq = "Bình thường";
        }
        else {
            kq = "Béo";
        }
        System.out.println(kq);
    }
}
