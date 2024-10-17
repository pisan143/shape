import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

public class Demo extends JFrame {

    // Demo sets up the main application window
    public Demo() {
        getContentPane().add(new DemoPanel());
        // just some windowing stuff that must happen for all Frames
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // DemoPanel is the main drawing area where shapes are drawn
    public class DemoPanel extends JPanel {

        // array of shapes to draw
        private ArrayList<Shape> myShapes = new ArrayList<Shape>();

        // constructor for DemoPanel - this is called when the program starts
        public DemoPanel() {
            for (int i = 0; i < 20; i++) {
                int rx = (int) (Math.random() * 200);
                int ry = (int) (Math.random() * 200);
                int radius = 1 + (int) (Math.random() * 10);
                myShapes.add(new Circle(rx, ry, radius));
            }
        }

        // this method is called every time the panel needs repainting
        public void paint(Graphics g) {
            super.paint(g); // don't remove - required for GUI widgets to draw correctly
            for (int i = 0; i < myShapes.size(); i++) {
                myShapes.get(i).draw(g);
            }
        }

    }

    // main method starts the application
    public static void main(String[] args) {
        System.out.println("Starting Demo...");
        Demo myApp = new Demo();
    }
}
