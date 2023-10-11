import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterS extends JComponent {
    private int width;
    private int height;

    public LetterS(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double sky = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(new Color(100,149,237));
        g2d.fill(sky);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255,0,255));
        g2d.drawArc(50, 200, 75, 100, 90, 180);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255,0,255));
        g2d.drawArc(50, 300, 75, 100, 270, 180);

    }
}
