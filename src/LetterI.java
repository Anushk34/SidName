import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterI extends JComponent {
    private int width;
    private int height;

    public LetterI(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double LineI1 = new Line2D.Double(200, 400, 200, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI1);
        Line2D.Double LineI2 = new Line2D.Double(150, 200, 250, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI2);
        Line2D.Double LineI3 = new Line2D.Double(150,400,250,400);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI3);
    }
}