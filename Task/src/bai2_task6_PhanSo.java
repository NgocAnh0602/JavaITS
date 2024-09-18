import java.util.Scanner;

class PhanSo {
    int tuSo;   // Tử số
    int mauSo;  // Mẫu số

    // Constructor để khởi tạo phân số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        simplify(); // Rút gọn phân số ngay khi khởi tạo
    }

    // Phương thức rút gọn phân số
    private void simplify() {
        int a = tuSo;
        int b = mauSo;
        // Tính ước số chung lớn nhất (UCLN) bằng cách sử dụng thuật toán Euclid
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        tuSo /= gcd;
        mauSo /= gcd;

        // Đảm bảo mẫu số luôn dương
        if (mauSo < 0) {
            tuSo *= -1;
            mauSo *= -1;
        }
    }

    // Phương thức cộng hai phân số
    public PhanSo add(PhanSo other) {
        int newTuSo = tuSo * other.mauSo + other.tuSo * mauSo;
        int newMauSo = mauSo * other.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    // Phương thức trừ hai phân số
    public PhanSo subtract(PhanSo other) {
        int newTuSo = tuSo * other.mauSo - other.tuSo * mauSo;
        int newMauSo = mauSo * other.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    // Phương thức nhân hai phân số
    public PhanSo multiply(PhanSo other) {
        int newTuSo = tuSo * other.tuSo;
        int newMauSo = mauSo * other.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    // Phương thức chia hai phân số
    public PhanSo divide(PhanSo other) {
        int newTuSo = tuSo * other.mauSo;
        int newMauSo = mauSo * other.tuSo;
        if (newMauSo == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có mẫu số bằng 0.");
        }
        return new PhanSo(newTuSo, newMauSo);
    }

    // Phương thức để hiển thị phân số dưới dạng chuỗi
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    // Phương thức nhập phân số từ người dùng
    public static PhanSo nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tử số: ");
        int tuSo = scanner.nextInt();
        System.out.print("Mẫu số: ");
        int mauSo = scanner.nextInt();
        return new PhanSo(tuSo, mauSo);
    }

    // Main method
    public static void main(String[] args) {
        // Nhập phân số a và b
        System.out.println("Nhập phân số a:");
        PhanSo a = nhapPhanSo();

        System.out.println("Nhập phân số b:");
        PhanSo b = nhapPhanSo();

        // Kiểm tra mẫu số hợp lệ
        if (a.mauSo == 0 || b.mauSo == 0) {
            System.out.println("Có phân số không hợp lệ (mẫu số bằng 0)!");
        } else {
            // Thực hiện các phép toán
            PhanSo resultAdd = a.add(b);
            PhanSo resultSubtract = a.subtract(b);
            PhanSo resultMultiply = a.multiply(b);
            PhanSo resultDivide = a.divide(b);

            // In kết quả
            System.out.println("Tổng a + b = " + resultAdd);
            System.out.println("Hiệu a - b = " + resultSubtract);
            System.out.println("Tích a * b = " + resultMultiply);
            System.out.println("Thương a / b = " + resultDivide);
        }
    }
}

