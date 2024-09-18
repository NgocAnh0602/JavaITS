// Lớp Shape đại diện cho hình học chung
abstract class Shape {
    // Phương thức tính diện tích (sẽ được ghi đè bởi các lớp con)
    public abstract double calculateArea();

    // Phương thức hiển thị thông tin (có thể được ghi đè nếu cần)
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Lớp Circle đại diện cho hình tròn
class Circle extends Shape {
    private double radius;

    // Constructor nhận vào bán kính của hình tròn
    public Circle(double radius) {
        this.radius = radius;
    }

    // Ghi đè phương thức tính diện tích cho hình tròn
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Ghi đè phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("This is a circle with radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Lớp Rectangle đại diện cho hình chữ nhật
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor nhận vào chiều rộng và chiều dài của hình chữ nhật
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Ghi đè phương thức tính diện tích cho hình chữ nhật
    public double calculateArea() {
        return width * height;
    }

    // Ghi đè phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("This is a rectangle with width: " + width + " and height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
public class bai2_task7 {
    public static void main(String[] args) {
        // Tạo một hình tròn
        Circle circle = new Circle(5);
        circle.displayInfo();
        System.out.println();
        // Tạo một hình chữ nhật
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayInfo();
    }
}
