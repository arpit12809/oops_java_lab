import java.util.Scanner;

// 2D Shape Class
class Plastic2D {
    double length, breadth;
    final double COST_PER_SQFT = 40;

    void input2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void cost2D() {
        double area = length * breadth;
        double cost = area * COST_PER_SQFT;
        System.out.println("Cost of 2D Sheet = Rs. " + cost);
    }
}

// 3D Shape Class inheriting 2D
class Plastic3D extends Plastic2D {
    double height;
    final double COST_PER_CUBICFT = 60;

    void input3D() {
        input2D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void cost3D() {
        double volume = length * breadth * height;
        double cost = volume * COST_PER_CUBICFT;
        System.out.println("Cost of 3D Box = Rs. " + cost);
    }
}

public class PlasticDemo {
    public static void main(String[] args) {
        Plastic3D p = new Plastic3D();
        System.out.println("Enter dimensions:");
        p.input3D();
        p.cost2D();
        p.cost3D();
    }
}
