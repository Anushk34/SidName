import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterT extends JComponent {
    private int width;
    private int height;

    public LetterT(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double T1 = new Line2D.Double(925, 400, 925, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,255));
        g2d.draw(T1);
        Line2D.Double T2 = new Line2D.Double(875, 200, 975, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,255));
        g2d.draw(T2);
    }
}

