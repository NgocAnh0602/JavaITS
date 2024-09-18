public class bai1_task6_Account {
    private String accountNumber;
    private double balance;

    // Constructor để khởi tạo tài khoản với số tài khoản và số dư ban đầu
    public bai1_task6_Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Phương thức gửi tiền (Deposit)
    public void deposit(double amount) {
        if (amount > 0) {  // Kiểm tra số tiền gửi phải lớn hơn 0
            balance += amount;
            System.out.println("Đã gửi " + amount + " vào tài khoản. Số dư mới: " + balance);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    // Phương thức rút tiền (Withdraw)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Kiểm tra số tiền rút phải hợp lệ và đủ số dư
            balance -= amount;
            System.out.println("Đã rút " + amount + " từ tài khoản. Số dư còn lại: " + balance);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc số dư không đủ.");
        }
    }

    // Phương thức kiểm tra số dư
    public double getBalance() {
        return balance;
    }

    // Phương thức để lấy số tài khoản
    public String getAccountNumber() {
        return accountNumber;
    }

    // Main method để thử nghiệm lớp
    public static void main(String[] args) {
        // Tạo tài khoản mới với số dư ban đầu là 1000
        bai1_task6_Account account = new bai1_task6_Account("123456789", 1000.0);

        // Gửi tiền vào tài khoản
        account.deposit(500.0);  // Gửi 500

        // Rút tiền từ tài khoản
        account.withdraw(200.0);  // Rút 200

        // Kiểm tra số dư hiện tại
        System.out.println("Số dư hiện tại: " + account.getBalance());
    }
}
