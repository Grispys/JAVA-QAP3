package problem2;

public class Demo {

    public static void main(String[] args) {
        Point p1 = new Point(2, 4);
        MovablePoint p2 = new MovablePoint(1, 1, 3.2f, 1.1f);

        System.out.println();
        System.out.println(p1.toString());
        p1.setX(5426);
        System.out.println(p1.toString());
        p1.setXY(897618, 909812);
        System.out.println(p1.toString());

        System.out.println();
        System.out.println(p2.toString());
        p2.setxSpeed(2.7f);
        System.out.println(p2.toString());
        p2.move();
        System.out.println(p2.toString());
    }
}
