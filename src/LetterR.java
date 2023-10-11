import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterR extends JComponent {
    private int width;
    private int height;

    public LetterR(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double R1 = new Line2D.Double(750, 400, 750, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.draw(R1);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.drawArc(675, 200, 150, 100, 270, 180);
        Line2D.Double R2 = new Line2D.Double(750, 300, 850, 400);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.draw(R2);
    }
}