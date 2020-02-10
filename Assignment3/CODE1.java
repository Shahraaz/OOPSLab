/**
 * Rectangle
 */
class Rectangle {
    int length, bredth;

    Rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    int area() {
        return length * bredth;
    }

    int perimeter() {
        return 2 * (length + bredth);
    }
}

/**
 * Square
 */
class Square extends Rectangle {
    int side;

    Square(int side) {
        super(side, side);
    }
}

/**
 * CODE1
 */
public class CODE1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,2);
        Square s = new Square(5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}