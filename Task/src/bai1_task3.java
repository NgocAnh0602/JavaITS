import java.util.Arrays;
import java.util.Scanner;

public class bai1_task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]= ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j+1]) {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        System.out.print(Arrays.toString(A));
    }
}
