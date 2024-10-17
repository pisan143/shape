import java.awt.Graphics;

public class Circle extends Shape {
    private int radius = 0;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), radius * 2, radius * 2);
    }

}
