import java.awt.Graphics;

// Shape is an abstract class that represents a shape that can be drawn
public abstract class Shape {
    // x and y are the coordinates of the top-left corner of the shape
    private int x = 0;
    private int y = 0;

    // constructor for Shape
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getX returns the x coordinate of the shape
    public int getX() {
        return x;
    }

    // getY returns the y coordinate of the shape
    public int getY() {
        return y;
    }

    // subclasses must implement this method
    public abstract void draw(Graphics g);
}